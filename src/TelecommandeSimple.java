/**
 * Created by association on 12/01/17.
 */
public class TelecommandeSimple {
    Commande emplacement;

    public TelecommandeSimple() {
    }

    public void setCommande(Commande commande) {
        this.emplacement = commande;
    }

    public void boutonPresse() {
        emplacement.executer();
    }
}
