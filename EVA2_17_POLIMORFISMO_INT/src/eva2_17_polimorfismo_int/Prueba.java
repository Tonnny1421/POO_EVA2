/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_17_polimorfismo_int;

public class Prueba implements Mensajes{
    
    @Override
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    public void otroMetodo(){
        System.out.println("Metodo Adicional");
    }
}
