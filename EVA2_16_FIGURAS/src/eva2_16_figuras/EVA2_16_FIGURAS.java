/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_16_figuras;


public class EVA2_16_FIGURAS {
    
    public static void main(String[] args) {
        
        Triangulo triangulo = new Triangulo(10 , 10);
        Circulo circulo = new Circulo(15);
        Rectangulo rectangulo = new Rectangulo(20 , 15);
        
     //   System.out.println("Area =" + trian.Calculararea());
     
    }
    
    public static void imprimirArea(Figura f) {
        System.out.println("Area =" + f.Calculararea());
    }
    
    public static void claseObject(Objeto o){
        
    }
}

class Figura{
    public double Calculararea(){
        return -1;
    }
}

