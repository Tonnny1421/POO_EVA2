/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_12_arreglos_3;

import java.util.Scanner;

public class EVA2_12_ARREGLOS_3 {

    public static void main(String[] args) {
        Persona[] arreglosPersona = new Persona[32];
        Scanner spect = new Scanner(System.in);
        
        for (int i = 0; i < 32; i++)
        {
            arreglosPersona[i]= new Persona();
            System.out.println("Cual es tu nombre?");
            arreglosPersona[i].setNombre(spect.nextLine());            
        }
        
        for (int i = 0; i < 32; i++)
        {
            System.out.println("Nombre "+arreglosPersona[i].getNombre());
        }
        
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