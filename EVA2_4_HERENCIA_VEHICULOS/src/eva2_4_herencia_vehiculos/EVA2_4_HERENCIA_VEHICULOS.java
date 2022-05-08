/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva2_4_herencia_vehiculos;

public class EVA2_4_HERENCIA_VEHICULOS {

    public static void main(String[] args) {

        Automovil auto = new Automovil("Nissan", "Sedan", "Versa Adavance TM", 2021, "Gasolina", 41, 4, 4, 5, "Automatico", 3, "Asistente de conductor, Panta 7'' Touchscreen, Camara de Reversa");
        auto.ImprimirDatos();

        Camion cam = new Camion("Kenworth", "T880", 1987, "Diesel", 261, 18, 80000, 3, 8, 3);
        cam.ImprimirDatos();
        
        Camioneta camioneta = new Camioneta("Ford", "Ranger", 2022, "Gasolina", 80, 4, 1, 4, 5);
        camioneta.ImprimirDatos();
        
        Motocicleta motocicleta = new Motocicleta("Vento", "Rocketman Sport", 2022, "Gasolina", 50, 4, 2, 2);
        motocicleta.ImprimirDatos();

    }
}
class Motocicleta extends Vehiculo{
    public Motocicleta(){
    super();
    }
    public Motocicleta(String Marca, String Modelo, int año, String tipCombustible, int capMotor, int cilMotor, int noLlantas, int noPasajeros){
    super(Marca, Modelo, tipCombustible, año, capMotor, cilMotor, noLlantas, noPasajeros);
    }
    @Override
    public void ImprimirDatos(){
    System.out.println("Motocicleta");
    super.ImprimirDatos();
    }
}

class Camioneta extends Vehiculo {

    private int capCarga;

    public Camioneta() {
        super();
        this.capCarga = 0;
    }

    public Camioneta(String Marca, String Modelo, int año, String tipCombustible, int capMotor, int cilMotor, int capCarga, int noLlantas, int noPasajeros) {
        super(Marca, Modelo, tipCombustible, año, capMotor, cilMotor, noLlantas, noPasajeros);
        this.capCarga = capCarga;
    }

    public int getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(int capCarga) {
        this.capCarga = capCarga;
    }

    @Override
    public void ImprimirDatos() {
        System.out.println("Camioneta");
        super.ImprimirDatos();
        System.out.println("Capacidad de carga: " + capCarga + " Tonelada");
        System.out.println("");
    }
}

class Camion extends Vehiculo {

    private int capCarga;
    private int noEjes;

    public Camion() {
        super();
        this.capCarga = 0;
        this.noEjes = 0;
    }

    public Camion(String Marca, String Modelo, int año, String tipCombustible, int capMotor, int cilMotor, int capCarga, int noEjes, int noLlantas, int noPasajeros) {
        super(Marca, Modelo, tipCombustible, año, capMotor, cilMotor, noLlantas, noPasajeros);
        this.capCarga = capCarga;
        this.noEjes = noEjes;
    }

    public int getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(int capCarga) {
        this.capCarga = capCarga;
    }

    public int getNoEjes() {
        return noEjes;
    }

    public void setNoEjes(int noEjes) {
        this.noEjes = noEjes;
    }

    @Override
    public void ImprimirDatos() {
        System.out.println("Camion");
        super.ImprimirDatos();
        System.out.println("Capacidad de carga: " + capCarga + " Libras");
        System.out.println("Numero de ejes: " + noEjes);
        System.out.println("");
    }

}

class Automovil extends Vehiculo {

    private String tipVeh;
    private int cantEquipamiento;
    private String equipamiento;
    private String transmision;

    public Automovil() {
        super();
        this.cantEquipamiento = 0;
        this.equipamiento = "";
        this.tipVeh = "";
        this.transmision = "";
    }

    public Automovil(String Marca, String tipVeh, String Modelo, int año, String tipCombustible, int capMotor, int cilMotor, int noLlantas, int noPasajeros, String transmision, int cantEquipamiento, String equipamiento) {
        super(Marca, Modelo, tipCombustible, año, capMotor, cilMotor, noLlantas, noPasajeros);
        this.cantEquipamiento = cantEquipamiento;
        this.equipamiento = equipamiento;
        this.tipVeh = tipVeh;
        this.transmision = transmision;

    }

    public String getTipVeh() {
        return tipVeh;
    }

    public void setTipVeh(String tipVeh) {
        this.tipVeh = tipVeh;
    }

    public int getCantEquipamiento() {
        return cantEquipamiento;
    }

    public void setCantEquipamiento(int cantEquipamiento) {
        this.cantEquipamiento = cantEquipamiento;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    @Override
    public void ImprimirDatos() {
        System.out.println("Automovil");
        System.out.println("Tipo de vehiculo: " + tipVeh);
        super.ImprimirDatos();
        System.out.println("Transmision: " + transmision);
        System.out.println("Cantidad de equipamiento: " + cantEquipamiento);
        System.out.println("Equipamiento: " + equipamiento);
        System.out.println("");
    }

}

class Vehiculo {

    private String tipCombustible;
    private int noLlantas;
    private int capMotor;
    private int cilMotor;
    private int noPasajeros;
    private String Marca;
    private String Modelo;
    private int año;

    public Vehiculo() {

        System.out.println("Vehiculo");
        this.Marca = "";
        this.Modelo = "";
        this.año = 0;
        this.capMotor = 0;
        this.cilMotor = 0;
        this.noLlantas = 0;
        this.noPasajeros = 0;
        this.tipCombustible = "";

    }

    public Vehiculo(String Marca, String Modelo, String tipCombustible, int año, int capMotor, int cilMotor, int noLlantas, int noPasajeros) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.año = año;
        this.capMotor = capMotor;
        this.cilMotor = cilMotor;
        this.noLlantas = noLlantas;
        this.noPasajeros = noPasajeros;
        this.tipCombustible = tipCombustible;
    }

    public String getTipCombustible() {
        return tipCombustible;
    }

    public void setTipCombustible(String tipCombustible) {
        this.tipCombustible = tipCombustible;
    }

    public int getNoLlantas() {
        return noLlantas;
    }

    public void setNoLlantas(int noLlantas) {
        this.noLlantas = noLlantas;
    }

    public int getCapMotor() {
        return capMotor;
    }

    public void setCapMotor(int capMotor) {
        this.capMotor = capMotor;
    }

    public int getCilMotor() {
        return cilMotor;
    }

    public void setCilMotor(int cilMotor) {
        this.cilMotor = cilMotor;
    }

    public int getNoPasajeros() {
        return noPasajeros;
    }

    public void setNoPasajeros(int noPasajeros) {
        this.noPasajeros = noPasajeros;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void ImprimirDatos() {
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Año: " + año);
        System.out.println("Tipo de combustible: " + tipCombustible);
        System.out.println("Numero de llantas: " + noLlantas);
        System.out.println("Capacidad del motor: " + capMotor + " l");
        System.out.println("Cilindros del motor: " + cilMotor);
        System.out.println("Capacidad de pasajeros: " + noPasajeros);

    }
}
