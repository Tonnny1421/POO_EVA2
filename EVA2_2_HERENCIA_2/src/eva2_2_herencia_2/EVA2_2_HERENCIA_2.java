/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_2_herencia_2;

public class EVA2_2_HERENCIA_2 {

    public static void main(String[] args) {
            
        Direccion dire = new Direccion("5ta", 7030, "girasoles", "31376", "chihuahua", "chihuahua", "6141636557");
        Estudiante estu1 = new Estudiante("21550740", "Luis", 18, dire);
        estu1.ImprimirDatos();
    }

}

class Direccion {

    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;
    private String telefono;

    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado, String telefono) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
        this.telefono = telefono;
    }

    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.colonia = "";
        this.cp = "";
        this.ciudad = "";
        this.estado = "";
        this.telefono = "";
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void imprimirDireccion(){
        System.out.println("Calle "+calle+" #"+numero+", col."+colonia+
                " , cp"+cp+", ciudad "+ " ,estado "+ estado+", telefono "+ telefono);
    }

}
//Relacion IS-A --> Estudiante es una persona 

class Estudiante extends Persona {

    private String noControl;
    //Esto es un objeto, pero sin instanciar, se instanciara en el constructor 
    private Direccion direccion;

    public Estudiante() {
        super();
        this.noControl = "";
        direccion = new Direccion();

    }

    public Estudiante(String noControl, String nombre, int edad, Direccion direccion) {
        super(nombre, edad);
        this.noControl = noControl;
        this.direccion = direccion; 
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    @Override
    public void ImprimirDatos() {
        super.ImprimirDatos();
        direccion.imprimirDireccion();
        System.out.println("No. De control: " + noControl);
    }

}

class Persona {

    private String nombre;
    private int edad;

    //constructor default
    public Persona() {
        this.nombre = "";
        this.edad = 0;
    }

//constructor con argumentos
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

    public void ImprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

}
