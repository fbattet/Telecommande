/**
 * Created by association on 12/01/17.
 */
public class CommandeEteindreLampe implements Commande {
    Lampe lampe;

    public CommandeEteindreLampe(Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void executer() {
        lampe.arret();
    }

    @Override
    public void annuler() {
        lampe.marche();
    }
}
