
package nominaempleadografico;

public class EmpleadoChofer extends EmpleadoPorComision {
    //Atributos
    private int SalarioBase;
    private Double RecorridoEnKm;
    private String TipoGasolina;
    private Double ViaticosAndCombustible;

    public EmpleadoChofer(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
            int SalarioBase, Double RecorridoEnKm,String TipoGasolina) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        
        this.RecorridoEnKm = RecorridoEnKm;
        this.SalarioBase = SalarioBase;
        this.TipoGasolina = TipoGasolina;
        ViaticosyCombustible(this.RecorridoEnKm, this.ViaticosAndCombustible, this.TipoGasolina);
        
    }

   
    public void ViaticosyCombustible(Double RecorridoEnKm, Double ViaticosAndCombustible, String TipoGasolina){
        /*Por cada 100 Km se le asigna el precio de 40 litros de gasolina (verificar si es
            Magna, Premium o Diésel)
        

        Magna $ 20.86 => $ 3,106.00
        Premium $ 21.25 =>$ 3,164.00
        Diésel $ 22.66 => $ 3,374.00
        */
        double gasolina=0;
        
        double viatico=RecorridoEnKm*4;
        if (RecorridoEnKm <100)
            viatico = 200;
       if (TipoGasolina == "Magna"){
          gasolina = (RecorridoEnKm *0.4)* 20.86;
         
       }else if(TipoGasolina == "Premium"){
           gasolina = (RecorridoEnKm *0.4)*  21.25;
       }else{//Diesel
          gasolina = (RecorridoEnKm *0.4) *  22.66;
       }
      
       double PrecioViatico = viatico+gasolina;
       setViaticosAndCombustible(PrecioViatico);           
    }

    @Override
    public String toString() {
        return "Empleado base chofer: "+ obtenerPrimerNombre() + " "+ obtenerApellidoPaterno() +
                "\nNumero de seguro Social: "+obtenerNumeroSeguroSocial() +
                "\nSueldo base mas viaticos: " + ( SalarioBase+ViaticosAndCombustible) +
                "\nBiaticos: " + ViaticosAndCombustible+"%.2f"+
                "\nTipo de gasolina: "+ getTipoGasolina();
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //GETTERS 

    public int getSalarioBase() {
        return SalarioBase;
    }

    public Double getRecorridoEnKm() {
        return RecorridoEnKm;
    }

    public String getTipoGasolina() {
        return TipoGasolina;
    }

    public Double getViaticosAndCombustible() {
        return ViaticosAndCombustible;
    }
    
    //Setter

    public void setViaticosAndCombustible(Double ViaticosAndCombustible) {
        this.ViaticosAndCombustible = ViaticosAndCombustible;
    }
    

}



