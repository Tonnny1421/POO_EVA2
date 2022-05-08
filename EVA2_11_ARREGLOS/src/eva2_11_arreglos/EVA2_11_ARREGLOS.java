/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_11_arreglos;

public class EVA2_11_ARREGLOS {

    public static void main(String[] args) {
        int [] arreglo = new int[10];
        arreglo[0]=000;
        System.out.println("El valor de arreglo en la posicion 0 es "+arreglo[0]);
        
        arreglo[1]=100;
        arreglo[2]=200;
        arreglo[3]=300;
        arreglo[4]=400;
        arreglo[5]=500;
        arreglo[6]=600;
        arreglo[7]=700;
        arreglo[8]=800;
        arreglo[9]=900;
        
        System.out.println("Tamaño del arreglo "+arreglo.length);
        
        String[] arreCade = new String[10];
        arreCade[5]= "Hola mundo";
        double [] arreDouble = new double[100000];
        arreDouble[99999] = 0.2;
        
        Persona [] clasePOO = new Persona[32];
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
