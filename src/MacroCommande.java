/**
 * Created by association on 13/01/17.
 */
public class MacroCommande implements Commande {
    Commande[] commandes;

    public MacroCommande(Commande[] commandes) {
        this.commandes = commandes;
    }

    @Override
    public void executer() {
        for (int i = 0; i < commandes.length; i++) {
            commandes[i].executer();
        }
    }

    @Override
    public void annuler() {
        for (int i = 0; i < commandes.length; i++) {
            commandes[i].annuler();

        }
    }
}
