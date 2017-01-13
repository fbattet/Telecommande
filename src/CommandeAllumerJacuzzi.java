/**
 * Created by association on 12/01/17.
 */
public class CommandeAllumerJacuzzi implements Commande {
    Jacuzzi jacuzzi;

    public CommandeAllumerJacuzzi(Jacuzzi jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public void executer() {
        jacuzzi.marche();
    }

    @Override
    public void annuler() {
        jacuzzi.arret();
    }
}
