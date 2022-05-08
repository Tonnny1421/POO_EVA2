/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_1_herencia;

public class EVA2_1_HERENCIA {

    public static void main(String[] args) {

        Estudiante estu1 = new Estudiante("Luis",18,"21550740");
        
        /* estu1.setNombre("Luis");
        estu1.setEdad(18);
        estu1.setNoControl("21550740");
        estu1.imprimirDatos();*/
       estu1.imprimirDatos();
       
       Maestro mtro1 = new Maestro("David",24,"1121120131");
       mtro1.imprimirDatos();
    }

}

//estudiante
class Maestro extends Persona{
    //No De Regsitro
    private String noRegistro;
    
    public Maestro(){
    super();
    System.out.println("Clase maestro");
    }
    public Maestro(String nombre, int edad, String noRegisro){
    super(nombre,edad);
    this.noRegistro = noRegisro;
    }

    public String getNoRegistro() {
        return noRegistro;
    }

    public void setNoRegistro(String noRegistro) {
        this.noRegistro = noRegistro;
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();//Imprimir datos de la clase persona (superclase)
        System.out.println("No. de registro: "+noRegistro);
    }
}

//estudiante

class Estudiante extends Persona {

    private String noControl;

    //Constructor Default
    public Estudiante(){
        super();//llamada al constructor de la superclase
        System.out.println("Clase estudiante");
    }
    public Estudiante(String nombre, int edad,String noControl){
        super(nombre,edad);
        this.noControl= noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    /*public void mostrarNombre(){
        System.out.println("Nombre Del Estudiante: "+ getNombre());
    }*/
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();//Imprimir datos de la clase persona (superclase)
        System.out.println("No. Control: "+noControl);
    }
}

//persona
class Persona {

    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "XXXXX";
        this.edad = 100000;
        System.out.println("Clase pesona");
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

    public void imprimirDatos() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
    }
}
