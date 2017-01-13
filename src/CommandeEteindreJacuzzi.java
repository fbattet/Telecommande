/**
 * Created by association on 12/01/17.
 */
public class CommandeEteindreJacuzzi implements Commande {
    Jacuzzi jacuzzi;

    public CommandeEteindreJacuzzi(Jacuzzi jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    @Override
    public void executer() {
        jacuzzi.arret();
    }

    @Override
    public void annuler() {
        jacuzzi.marche();
    }
}
