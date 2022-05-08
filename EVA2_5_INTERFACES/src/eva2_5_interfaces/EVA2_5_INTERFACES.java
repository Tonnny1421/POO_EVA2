/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_5_interfaces;

public class EVA2_5_INTERFACES {


    public static void main(String[] args) {
        Persona perso = new Persona();
        perso.setNombre("Luis");
        perso.setEdad(18);
        perso.imprimirDatos();
        
        Vehiculo veh= new Vehiculo();
        veh.setMarca("Nissan");
        veh.setModelo("Modelo");
        veh.imprimirDatos();
        veh.mostrarMensaje();
    }
    
}

class Persona implements MuestraDatos{
    private String nombre;
    private int edad;

    public Persona() {
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
    
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre "+ nombre);
        System.out.println("Edad "+ edad);
    }
}

class Vehiculo implements MuestraDatos, Mensaje{
    private String marca;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void imprimirDatos() {
         System.out.println("Marca "+ marca);
         System.out.println("Modelo "+modelo);
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Hola mundo");
    }
    
    
}
interface MuestraDatos{
    //Solo acepta metodos publicos
    //Solo acepta declaraciones de metodos --> Solo acepta metodos abstratos
    public void imprimirDatos();
}

interface Mensaje{
    public void mostrarMensaje();
}