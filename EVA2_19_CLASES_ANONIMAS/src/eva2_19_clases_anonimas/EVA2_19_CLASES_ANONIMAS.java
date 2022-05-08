/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_19_clases_anonimas;

public class EVA2_19_CLASES_ANONIMAS {

    public static void main(String[] args) {
      Mensajes mensaje = new Mensajes() {
          @Override
          public void mostrarMensajes() {
              System.out.println("Hola mundo");
          }
      };
      mensaje.mostrarMensajes();
    }
}
interface Mensajes{
    public void mostrarMensajes();
}