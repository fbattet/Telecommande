/**
 * Created by association on 12/01/17.
 */
public class Telecommande {
    private Commande[] commandesMarche;
    private Commande[] commandesArret;

    public Telecommande() {
        commandesMarche = new Commande[7];
        commandesArret = new Commande[7];

        Commande pasDeCommande = new PasDeCommande();
        for (int i = 0; i < 7; i++) {
            commandesMarche[i] = pasDeCommande;
            commandesArret[i] = pasDeCommande;
        }
    }

    public void setCommande(int empt, Commande comMarche, Commande comArret) {
        commandesMarche[empt] = comMarche;
        commandesArret[empt] = comArret;
    }

    public void boutonMarchePresse(int empt) {
        commandesMarche[empt].executer();
    }

    public void boutonArretPresse(int empt) {
        commandesArret[empt].executer();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n----- Télécommande -----\n");
        for (int i = 0; i < commandesMarche.length; i++) {
            stringBuff.append("[localisation " + i + "]" + commandesMarche[i].getClass().getName()
                    + " " + commandesArret[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
