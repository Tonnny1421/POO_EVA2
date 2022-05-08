/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_6_herencia_e_interfaces;

public class Estudiante extends Persona implements MuestraDatos{
    private String numeroControl;

    public Estudiante() {
        super();
        this.numeroControl="";
    }

    public Estudiante(String numeroControl, String nombre, int edad) {
        super(nombre, edad);
        this.numeroControl = numeroControl;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre "+getNombre());
        System.out.println("Edad "+ getNumeroControl());
        System.out.println("Numero de control "+ numeroControl);
    }
    
    
}
