/**
 * Created by association on 12/01/17.
 */
public class CommandeAllumerLampe implements Commande {
    Lampe lampe;

    public CommandeAllumerLampe(Lampe lampe) {
        this.lampe = lampe;
    }

    public void executer() {
        lampe.marche();
    }

    @Override
    public void annuler() {
        lampe.arret();
    }
}
