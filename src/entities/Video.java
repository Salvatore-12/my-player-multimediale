package entities;

import interfaces.LuminositàRegolabbile;
import interfaces.VolumeRegolabbile;

public class Video extends ContenutoMultimediale implements VolumeRegolabbile, LuminositàRegolabbile {


    public Video(int duration, int volume) {
        super(duration, volume);
    }


    //TUTTI GLI OVERRIDE//
    @Override
    public void play() {

    }

    @Override
    public void alzaVolume() {
        if (volume < 10) {
            volume++;
            System.out.println("il volume è aumento a" + volume);
        } else {
            System.out.println("il volume è al massimo");
        }
    }

    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("il volume è diminuito a" + volume);
        } else {
            System.out.println("il volume e al minimo");
        }
    }


    @Override
    public void aumentaluminosità() {

    }

    @Override
    public void diminuisciluminosità() {
    }
}
