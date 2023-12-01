package entities;

import interfaces.LuminositàRegolabbile;
import interfaces.VolumeRegolabbile;

public class Video extends ContenutoMultimediale implements VolumeRegolabbile, LuminositàRegolabbile {


    public Video(int duration, int volume) {
        super(duration, volume);
    }

    @Override
    public void play() {

    }


    @Override
    public void alzaVolume() {

    }

    @Override
    public void abbassaVolume() {

    }


    @Override
    public void aumentaluminosità() {

    }

    @Override
    public void diminuisciluminosità() {

    }
}
