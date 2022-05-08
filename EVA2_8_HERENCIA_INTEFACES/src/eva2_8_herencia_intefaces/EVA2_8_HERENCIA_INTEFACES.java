/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_8_herencia_intefaces;

public class EVA2_8_HERENCIA_INTEFACES {

    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        prueba.metodoA();
        prueba.metodoB();
    }
    
}
class Prueba implements B{

    @Override
    public void metodoB() {
      
    }

    @Override
    public void metodoA() {
       
    }

}

interface A{
public void metodoA();
}
interface B extends A{
public void metodoB();
}