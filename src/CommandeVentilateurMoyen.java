/**
 * Created by association on 12/01/17.
 */
public class CommandeVentilateurMoyen implements Commande {
    Ventilateur ventilateur;
    int derniereVitesse;

    @Override
    public void executer() {
        derniereVitesse = ventilateur.getVitesse();
        ventilateur.moyen();
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

    public CommandeVentilateurMoyen(Ventilateur ventilateur) {
        this.ventilateur = ventilateur;
    }

}
