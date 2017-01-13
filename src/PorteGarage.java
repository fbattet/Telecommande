/**
 * Created by association on 12/01/17.
 */
public class PorteGarage {
    String empt;

    public PorteGarage(String empt) {
        this.empt = empt;
    }

    public void ouvrir() {
        System.out.println("Porte garage ouverte");
    }

    public void fermer() {
        System.out.println("Porte garage fermée");
    }

    public void stop() {
        System.out.println("STOP");
    }

    public void lampeAllumee() {
        System.out.println("Lampe garage allumee");
    }

    public void lampeEteinte() {
        System.out.println("Lampe garage éteinte");
    }
}
