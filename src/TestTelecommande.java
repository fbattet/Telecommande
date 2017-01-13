/**
 * Created by association on 12/01/17.
 */
public class TestTelecommande {
    public static void main(String[] args) {
        TelecommandeSimple telecommande = new TelecommandeSimple();
        Lampe lampe = new Lampe("");
        PorteGarage porteGarage = new PorteGarage("");
        CommandeAllumerLampe lampeAllumee = new CommandeAllumerLampe(lampe);
        CommandeOuvrirPorteGarage garageOuvert = new CommandeOuvrirPorteGarage(porteGarage);

        telecommande.setCommande(lampeAllumee);
        telecommande.boutonPresse();
        telecommande.setCommande(garageOuvert);
        telecommande.boutonPresse();
    }
}
