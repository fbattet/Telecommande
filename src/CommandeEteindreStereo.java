/**
 * Created by association on 12/01/17.
 */
public class CommandeEteindreStereo implements Commande {
    Stereo stereo;

    public CommandeEteindreStereo(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void executer() {
        stereo.arret();
    }

    @Override
    public void annuler() {
        stereo.marche();
    }
}
