
package nominaempleadografico;

public class EmpleadoChofer extends EmpleadoPorComision {
    //Atributos
    private int SalarioBase;
    private Double RecorridoEnKm;
    private String TipoGasolina;
    private Double ViaticosAndCombustible;

    public EmpleadoChofer(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, int SalarioBase, Double RecorridoEnKm,String TipoGasolina) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        this.RecorridoEnKm = RecorridoEnKm;
        this.SalarioBase = SalarioBase;
        this.TipoGasolina = TipoGasolina;
        ViaticosyCombustible(this.RecorridoEnKm, this.ViaticosAndCombustible, this.TipoGasolina);
        
    }

   
    public void ViaticosyCombustible(Double RecorridoEnKm, Double ViaticosAndCombustible, String TipoGasolina){
        final double precioPorLitro = 0.4;
        
        final double precioGasolina = (TipoGasolina.equals(    "Magna"))   ? 20.86:
                                                               (TipoGasolina.equals("Premium"))   ? 21.25:
                                                                                                                                    22.66;
                
        double viatico = (RecorridoEnKm < 100) ? 200 : (RecorridoEnKm * 4);
        double gasolina = ( (RecorridoEnKm *precioPorLitro ) * precioGasolina );
                                        
                 
       double PrecioViatico = viatico+gasolina;
       setViaticosAndCombustible(PrecioViatico);           
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %s\n%s",
                     "Empleado base chofer", obtenerPrimerNombre(), obtenerApellidoPaterno(), 
                                                      "NSS", obtenerNumeroSeguroSocial(),
                "Sueldo base mas viaticos", ( SalarioBase+ViaticosAndCombustible),
                                               "Biaticos", ViaticosAndCombustible,
                                "Tipo de gasolina", TipoGasolina,
                            "------------------------------------------------------------------");
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



