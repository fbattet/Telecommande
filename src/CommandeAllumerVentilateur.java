/**
 * Created by association on 12/01/17.
 */
public class CommandeAllumerVentilateur implements Commande{
    Ventilateur ventilateur;
    int derniereVitesse;

    public CommandeAllumerVentilateur(Ventilateur ventilateur) {
        this.ventilateur = ventilateur;
    }

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
}
