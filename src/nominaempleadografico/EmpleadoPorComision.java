
package nominaempleadografico;


public class EmpleadoPorComision{
    //Atributos
    private  EmpleadoPorComision lista[];
    protected int contador;

    
    public EmpleadoPorComision(int tamañoMaximo) {
        lista = new EmpleadoPorComision[tamañoMaximo];
        contador = 0;
    }
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas; // ventas totales por semana
    private double tarifaComision; // porcentaje de comisión

  public boolean add(EmpleadoPorComision e) {
        if (contador == lista.length)
        {
            System.out.println("No se pueden ingresar valores, la lista esta llena!");
            return false;
        }
        else
        {
            lista[contador] = e;
            contador++;
            return true;
        }
    }
      //Constructor tres argumentos para el chofer

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
  
  
  
    // constructor con cinco argumentos
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public EmpleadoPorComision(String nombre, String apellido, String nss, 
            double ventas, double tarifa) { // la llamada implícita al constructor de Object ocurre aquí
        this.primerNombre = nombre;
        this.apellidoPaterno = apellido;
        this.numeroSeguroSocial = nss;
        establecerVentasBrutas(ventas); // valida y almacena las ventas brutas
        establecerTarifaComision(tarifa); // valida y almacena la tarifa de comisión
    } // fin del constructor de EmpleadoPorComision3 con cinco argumentos

    // establece el primer nombre
    public void establecerPrimerNombre(String nombre ){
        primerNombre = nombre;
    } // fin del método establecerPrimerNombre

    // devuelve el primer nombre
    public String obtenerPrimerNombre(){
        return primerNombre;
    } // fin del método obtenerPrimerNombre

    // establece el apellido paterno
    public void establecerApellidoPaterno(String apellido ){
        apellidoPaterno = apellido;
    } // fin del método establecerApellidoPaterno

    // devuelve el apellido paterno
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    } // fin del método obtenerApellidoPaterno

    // establece el número de seguro social
    public void establecerNumeroSeguroSocial(String nss ){
        numeroSeguroSocial = nss; // debe validar
    } // fin del método establecerNumeroSeguroSocial

    // devuelve el número de seguro social
    public String obtenerNumeroSeguroSocial(){
        return numeroSeguroSocial;
    } // fin del método obtenerNumeroSeguroSocial

    // establece el monto de ventas brutas
    public void establecerVentasBrutas( double ventas ){
        ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
    } // fin del método establecerVentasBrutas

    // devuelve el monto de ventas brutas
    public double obtenerVentasBrutas(){
        return ventasBrutas;
    } // fin del método obtenerVentasBrutas

    // establece la tarifa de comisión
    public void establecerTarifaComision( double tarifa ){
        tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
    } // fin del método establecerTarifaComision

    // devuelve la tarifa de comisión
    public double obtenerTarifaComision(){
        return tarifaComision;
    } // fin del método obtenerTarifaComision

    // calcula los ingresos
    //método polimófico
    public double ingresos(){
        return obtenerTarifaComision() * obtenerVentasBrutas();
    } // fin del método ingresos

    // devuelve representación String del objeto EmpleadoPorComision3
   public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "empleado por comision", obtenerPrimerNombre(), obtenerApellidoPaterno(),
                "numero de seguro social", obtenerNumeroSeguroSocial(),
                "ventas brutas", obtenerVentasBrutas(),
                "tarifa de comision", obtenerTarifaComision(),
                "sueldo más comisión",ingresos()); 
    }
    
    public String toStringg() { //Y ESTE CICLO ES REPETIDO HASTA EL TOTAL DE PELICULAS
        String s = "";
        for (int i = 0; i < contador; i++) {
            s += lista[i].toString() + "\n\n";
        }
        return s;
    } 
 } // fin de la clase EmpleadoPorComision3