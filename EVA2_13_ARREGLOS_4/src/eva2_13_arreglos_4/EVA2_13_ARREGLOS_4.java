/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_13_arreglos_4;

import java.util.Scanner;

public class EVA2_13_ARREGLOS_4 {
    
    public static final int TAMA = 100;
    
    public static void main(String[] args) {
        int[] arregloEdad = new int[TAMA];
        System.out.println("Tamaño arreglo " +arregloEdad.length);
        
        Scanner spect = new Scanner(System.in);
        for (int i = 0; i < arregloEdad.length; i++)
        {
            System.out.println("Cual es tu edad?");
            arregloEdad[i] = spect.nextInt();
        }
        for (int i = 0; i < arregloEdad.length; i++)
        {
            System.out.print("[ " + arregloEdad[i] + " ]");
        }
    }

}
