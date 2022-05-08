/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_10_metodos_abstractos;

public class EVA2_10_METODOS_ABSTRACTOS {

    public static void main(String[] args) {
        
    }
    
}
class ImplementaAbstracto extends  ClaseAbstracta{

    @Override
    public void metodoAbstracto() {
        
    }

}

abstract class ClaseAbstracta{
       public void metodoImplementados(){
           System.out.println("Metodo implementado");
       }
       public abstract void metodoAbstracto();
}