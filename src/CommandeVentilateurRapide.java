/**
 * Created by association on 12/01/17.
 */
public class CommandeVentilateurRapide implements Commande {
    Ventilateur ventilateur;
    int derniereVitesse;

    @Override
    public void executer() {
        derniereVitesse = ventilateur.getVitesse();
        ventilateur.rapide();
    }

    @Override
    public void annuler() {
        switch (derniereVitesse) {
            case Ventilateur.RAPIDE:
                ventilateur.rapide();
                break;
            case Ventilateur.MOYEN:
                ventilateur.moyen();
                break;
            case Ventilateur.LENT:
                ventilateur.lent();
                break;
            case Ventilateur.ARRET:
                ventilateur.arret();
                break;
        }

    }

    public CommandeVentilateurRapide(Ventilateur ventilateur) {
        this.ventilateur = ventilateur;
    }

}
