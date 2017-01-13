/**
 * Created by association on 12/01/17.
 */
public class CommandeEteindreTv implements Commande {
    Tv tv;

    public CommandeEteindreTv(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void executer() {
        tv.arret();
    }

    @Override
    public void annuler() {
        tv.marche();
    }
}
