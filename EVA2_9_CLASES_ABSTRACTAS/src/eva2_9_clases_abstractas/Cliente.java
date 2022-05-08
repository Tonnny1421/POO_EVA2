/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_9_clases_abstractas;

public class Cliente extends Persona{
    private String RFC;

    public Cliente() {
    }

    public Cliente(String RFC) {
        this.RFC = RFC;
    }

    public Cliente(String RFC, String nombre, int edad) {
        super(nombre, edad);
        this.RFC = RFC;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    
    
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre "+ getNombre());
        System.out.println("Edad "+ getEdad());
        System.out.println("RFC "+RFC);
    }
    
}
