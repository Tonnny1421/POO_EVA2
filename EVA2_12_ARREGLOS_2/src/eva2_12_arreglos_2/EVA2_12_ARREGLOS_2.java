/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_12_arreglos_2;

import java.util.Scanner;

public class EVA2_12_ARREGLOS_2 {
    public static void main(String[] args) {
     int[] arregloEdad= new int[32];
     Scanner spect = new Scanner(System.in);
        for (int i = 0; i < 32; i++)
        {
            System.out.println("Cual es tu edad?");
            arregloEdad[i] = spect.nextInt();
        }
        for (int i = 0; i < 32; i++)
        {
            System.out.print("[ "+arregloEdad[i]+" ]");
        }
    }
    
}
