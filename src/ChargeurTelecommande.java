/**
 * Created by association on 12/01/17.
 */
public class ChargeurTelecommande {
    public static void main(String[] args) {  //temp
        Telecommande telecommande = new Telecommande();

        Lampe lampeSejour = new Lampe("Sejour");
        Lampe lampeCuisine = new Lampe("Cuisine");
        Ventilateur ventilateur = new Ventilateur("Séjour");

        PorteGarage porteGarage = new PorteGarage("");
        Stereo stereo = new Stereo("Séjour");

        CommandeAllumerLampe lampeSejourAllumee = new CommandeAllumerLampe(lampeSejour);
        CommandeEteindreLampe lampeSejourEteinte = new CommandeEteindreLampe(lampeSejour);
        CommandeAllumerLampe lampeCuisineAllumee = new CommandeAllumerLampe(lampeSejour);
        CommandeEteindreLampe lampeCuisineEteinte = new CommandeEteindreLampe(lampeCuisine);

        CommandeAllumerVentilateur ventilateurAllume = new CommandeAllumerVentilateur(ventilateur);
        CommandeEteindreVentilateur ventilateurEteint = new CommandeEteindreVentilateur(ventilateur);

        CommandeOuvrirPorteGarage porteGarageOuverte = new CommandeOuvrirPorteGarage(porteGarage);
        CommandeFermerPortGarage porteGarageFermee = new CommandeFermerPortGarage(porteGarage);

        CommandeAllumerStereoAvecCd stereoAvecCd = new CommandeAllumerStereoAvecCd(stereo);
        CommandeEteindreStereo stereoEteinte = new CommandeEteindreStereo(stereo);

        telecommande.setCommande(0,lampeSejourAllumee, lampeSejourEteinte);
        telecommande.setCommande(1,lampeCuisineAllumee,lampeCuisineEteinte);
        telecommande.setCommande(2,ventilateurAllume, ventilateurEteint);
        telecommande.setCommande(3,stereoAvecCd,stereoEteinte);

        System.out.println(telecommande);

        telecommande.boutonMarchePresse(0);
        telecommande.boutonArretPresse(0);
        telecommande.boutonMarchePresse(1);
        telecommande.boutonArretPresse(1);
        telecommande.boutonMarchePresse(2);
        telecommande.boutonArretPresse(2);
        telecommande.boutonMarchePresse(3);
        telecommande.boutonArretPresse(3);

    }
}
