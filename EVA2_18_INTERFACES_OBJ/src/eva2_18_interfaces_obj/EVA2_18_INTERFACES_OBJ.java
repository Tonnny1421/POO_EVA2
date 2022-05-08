/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_18_interfaces_obj;

public class EVA2_18_INTERFACES_OBJ {

    public static void main(String[] args) {
       Persona persona = new Persona();
       persona.setNombre("Ana");
       
       Mensajes mensaje = persona;
       mensaje.mostrarMensaje();
    }
}
interface Mensajes{
    public void mostrarMensaje();
}
class Persona implements Mensajes{
    private int edad;
    private String nombre;

    public Persona() {
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void mostrarMensaje(){
        System.out.println(nombre);
    }
}
