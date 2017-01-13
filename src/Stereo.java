/**
 * Created by association on 12/01/17.
 */
public class Stereo {
    int volume;
    String empt;

    public Stereo(String empt) {
        this.empt = empt;
    }

    public void marche() {
        System.out.println(empt + " : Stéréo allumée");
    }

    public void arret() {
        System.out.println(empt + " : Stéréo arrétée");
    }

    public void setCd() {
        System.out.println(empt + " : Stéréo en mode CD");
    }

    public void setDvd() {
        System.out.println(empt + " : Stéréo en mode DVD");
    }

    public void setRadio() {
        System.out.println(empt + " : Stéréo en mode Radio");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(empt + " : le volume stéréo est " + volume);
    }
}
