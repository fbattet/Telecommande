/**
 * Created by association on 13/01/17.
 */
public class ChargeurTelecommande4 {
    public static void main(String[] args) {
        Lampe lampe = new Lampe("Séjour");
        Tv tv = new Tv("Séjour");
        Stereo stereo = new Stereo("Séjour");
        Jacuzzi jacuzzi = new Jacuzzi("Séjour");

        CommandeAllumerLampe lampeAllumee = new CommandeAllumerLampe(lampe);
        CommandeAllumerStereo stereoAllumee = new CommandeAllumerStereo(stereo);
        CommandeAllumerTv tvAllumee = new CommandeAllumerTv(tv);
        CommandeAllumerJacuzzi jacuzziAllume = new CommandeAllumerJacuzzi(jacuzzi);

        CommandeEteindreLampe lampeEteinte = new CommandeEteindreLampe(lampe);
        CommandeEteindreStereo stereoEteinte = new CommandeEteindreStereo(stereo);
        CommandeEteindreTv tvEteinte = new CommandeEteindreTv(tv);
        CommandeEteindreJacuzzi jacuzziEteint = new CommandeEteindreJacuzzi(jacuzzi);

        Commande[] allumageGroupe = { lampeAllumee, stereoAllumee, tvAllumee, jacuzziAllume };
        Commande[] extinctionGroupe = {jacuzziEteint, tvEteinte, stereoEteinte, lampeEteinte};
        MacroCommande macroAllumageGroupe = new MacroCommande(allumageGroupe);
        MacroCommande macroExtinctionGroupe = new MacroCommande(extinctionGroupe);

        TelecommandeAvecAnnul telecommande = new TelecommandeAvecAnnul();
        telecommande.setCommande(0, macroAllumageGroupe, macroExtinctionGroupe);

        System.out.println(telecommande);
        System.out.println("--- Exécution de Macro Marche ---");
        telecommande.boutonMarchePresse(0);
        System.out.println("--- Exécution de Macro Arret ---");
        telecommande.boutonArretPresse(0);
        System.out.println("--- Annulation ---");
        telecommande.boutonAnnulPresse();
    }
}
