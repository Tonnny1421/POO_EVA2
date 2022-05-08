/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_3_herencia_3;

public class EVA2_3_HERENCIA_3 {

    public static void main(String[] args) {
        //Animal animal = new Animal();
        //animal.mover();
        //Vertebrado verte = new Vertebrado();
        //verte.esqueleto();
        //Mamifero mamifero = new Mamifero();
        //mamifero.Pelo();
        //Primate primate = new Primate();
        //primate.sujetarObj();
        Humano humano = new Humano();
        humano.pensar();
    }

}
class Humano extends Primate{
    public Humano(){
    super();
        System.out.println("Humano");
    }
    public void pensar(){
        System.out.println("Pensar");
    }
}
class Primate extends Mamifero{
    public Primate(){
        super();
        System.out.println("Primate");
    }

    public void sujetarObj(){
    System.out.println("Agarra objetos");
    }
}

class Mamifero extends Vertebrado{
    public Mamifero(){
        super();
        System.out.println("Mamifero");
    }

    public void Pelo(){
    System.out.println("Tiene pelo");
    }
}
class Vertebrado extends Animal {

    public Vertebrado() {
        super();
        System.out.println("Vertebrado");
    }

    public void esqueleto() {
        System.out.println("Vertebrado");
    }

}

//animal
class Animal {

    public Animal() {
        System.out.println("Animal");
    }

    public void mover() {
        System.out.println("Animal movimiento");
    }
}
