/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_9_clases_abstractas;

public abstract class Persona implements MuestraDatos{
    private String nombre;
    private int edad;

    public Persona() {
        this.edad=0;
        this.nombre= "";
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
