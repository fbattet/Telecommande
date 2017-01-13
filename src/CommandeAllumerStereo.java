/**
 * Created by association on 12/01/17.
 */
public class CommandeAllumerStereo implements Commande {
    Stereo stereo;

    public CommandeAllumerStereo(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void executer() {
        stereo.marche();
    }

    @Override
    public void annuler() {
        stereo.arret();
    }
}
