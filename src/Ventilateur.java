/**
 * Created by association on 12/01/17.
 */
public class Ventilateur {

    public static final int RAPIDE = 3 ;
    public static final int MOYEN = 2 ;
    public static final int LENT = 1 ;
    public static final int ARRET = 0 ;
    int vitesse;
    String localisation;

    public Ventilateur(String localisation) {
        this.localisation = localisation;
        vitesse = ARRET;
    }

    public void rapide() {
        vitesse = RAPIDE;
        System.out.println(localisation + " : Vitesse ventilateur : rapide");
    }

    public void moyen() {
        vitesse = MOYEN;
        System.out.println(localisation + " : Vitesse ventilateur : moyen");
    }

    public void lent() {
        vitesse = LENT;
        System.out.println(localisation + " : Vitesse ventilateur : lent");
    }

    public void arret() {
        vitesse = ARRET;
        System.out.println(localisation + " : Ventillateur arrété");
    }

    public int getVitesse() {
        return vitesse;
    }
}
