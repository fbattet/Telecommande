/**
 * Created by association on 12/01/17.
 */
public class Jacuzzi {
    String empt;

    public Jacuzzi(String empt) {
        this.empt = empt;
    }

    public void marche() {
        System.out.println(empt + " : Jacuzzi allumé");

    }

    public void arret() {
        System.out.println(empt + " : Jacuzzi éteint");

    }
}
