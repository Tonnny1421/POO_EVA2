/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_16_figuras;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
   

    @Override
    public double Calculararea(){
        return(base * altura) / 2;
    }
   
        
    }

