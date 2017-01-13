/**
 * Created by association on 12/01/17.
 */
public class CommandeAllumerStereoAvecCd implements Commande {
    Stereo stereo;

    public CommandeAllumerStereoAvecCd(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void executer() {
        stereo.marche();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void annuler() {
        stereo.arret();
    }
}
