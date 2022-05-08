/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_14_final;

public class EVA2_14_FINAL {

    public static void main(String[] args) {
        
    }
    
}

final class Estudiante extends Persona{
    private String noControl;

    public Estudiante() {
    }

    public Estudiante(String noControl) {
        this.noControl = noControl;
    }

    public Estudiante(String noControl, String nombre) {
        super(nombre);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    

}
class Persona{
private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}