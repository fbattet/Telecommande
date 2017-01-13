/**
 * Created by association on 12/01/17.
 */
public class ChargeurTelecommande2 {
    public static void main(String[] args) {
        TelecommandeAvecAnnul teleCommande = new TelecommandeAvecAnnul();

        Lampe lampeSejour = new Lampe("Séjour");

        CommandeAllumerLampe lampeSejourAllumee = new CommandeAllumerLampe(lampeSejour);

        CommandeEteindreLampe lampeSejourEteinte = new CommandeEteindreLampe(lampeSejour);
        teleCommande.setCommande(0, lampeSejourAllumee, lampeSejourEteinte);

        teleCommande.boutonMarchePresse(0);
        teleCommande.boutonArretPresse(0);
        System.out.println(teleCommande);
        teleCommande.boutonAnnulPresse();
        teleCommande.boutonArretPresse(0);
        teleCommande.boutonMarchePresse(0);
        System.out.println(teleCommande);
        teleCommande.boutonAnnulPresse();

    }
}
