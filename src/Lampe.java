/**
 * Created by association on 12/01/17.
 */
public class Lampe {
    String empt;

    public Lampe(String empt) {
        this.empt = empt;
    }

    public void marche() {
        System.out.println(empt + " : Lampe allumée");

    }

    public void arret() {
        System.out.println(empt + " : Lampe éteinte");

    }
}
