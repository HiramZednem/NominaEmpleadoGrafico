/**
 * AQUI SE APLICA EL POLIMORFISMO
 */
package nominaempleadografico;


public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;

    
    // constructor con seis argumentos
    public EmpleadoBaseMasComision( String nombre, String apellido,String nss, double ventas, double tarifa, double salario ){
    super( nombre, apellido, nss, ventas, tarifa );
    establecerSalarioBase( salario ); 
    } 

  // establece el salario base
    public void establecerSalarioBase( double salario ){
     salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
    } // fin del método establecerSalarioBase// fin del método establecerSalarioBase

  // devuelve el salario base
    public double obtenerSalarioBase(){
     return salarioBase;
    } // fin del método obtenerSalarioBase// fin del método obtenerSalarioBase

  // calcula los ingresos
    public double ingresos(){
     return obtenerSalarioBase() + super.ingresos();
    } // fin del método ingresos// fin del método ingresos

  // devuelve representación String de EmpleadoBaseMasComision4
    public String toString(){
     return String.format( "%s %s\n%s: %.2f", "con sueldo base",
             super.toString(), "sueldo base", obtenerSalarioBase());
    }
} // fin de la clase EmpleadoBaseMasComision4
