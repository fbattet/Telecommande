/**
 * Created by association on 12/01/17.
 */
public class CommandeFermerPortGarage implements Commande {
    PorteGarage porteGarage;

    public CommandeFermerPortGarage(PorteGarage porteGarage) {
        this.porteGarage = porteGarage;
    }

    @Override
    public void executer() {
        porteGarage.fermer();
    }

    @Override
    public void annuler() {
        porteGarage.ouvrir();
    }
}
