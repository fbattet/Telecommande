/**
 * Created by association on 12/01/17.
 */
public class CommandeOuvrirPorteGarage implements Commande {
    PorteGarage porteGarage;

    public CommandeOuvrirPorteGarage(PorteGarage porteGarage) {
        this.porteGarage = porteGarage;
    }

    @Override
    public void executer() {
        porteGarage.ouvrir();
    }

    @Override
    public void annuler() {
        porteGarage.fermer();
    }
}
