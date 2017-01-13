/**
 * Created by association on 12/01/17.
 */
public class Tv {
    String empt;

    public Tv(String empt) {
        this.empt = empt;
    }

    public void marche() {
        System.out.println(empt + " : TV allumée");

    }

    public void arret() {
        System.out.println(empt + " : TV éteinte");

    }
}
