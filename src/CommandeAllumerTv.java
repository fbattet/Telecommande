/**
 * Created by association on 12/01/17.
 */
public class CommandeAllumerTv implements Commande {
    Tv tv;

    public CommandeAllumerTv(Tv tv) {
        this.tv = tv;
    }

    public void executer() {
        tv.marche();
    }

    @Override
    public void annuler() {
        tv.arret();
    }
}
