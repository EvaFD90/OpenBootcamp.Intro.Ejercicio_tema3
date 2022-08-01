public class EjercicioCoche {
    public static void main (String[] args){
        Coche miCoche = new Coche ();
        miCoche.sumarPuerta();
        miCoche.sumarPuerta();
        System.out.println(miCoche.puertas);
    }

}
class Coche {
    public int puertas = 0;
    public void sumarPuerta () {
        this.puertas++;
    }
}