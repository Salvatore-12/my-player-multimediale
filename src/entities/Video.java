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
    volume++;
    }

    @Override
    public void abbassaVolume() {
    volume--;
    }


    @Override
    public void aumentaluminosità() {

    }

    @Override
    public void diminuisciluminosità() {
    }
}
