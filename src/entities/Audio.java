package entities;

import interfaces.LuminositàRegolabbile;
import interfaces.VolumeRegolabbile;

public class Audio extends ContenutoMultimediale implements VolumeRegolabbile{

    //ATTRIBUTE//
    public String Titolo ="Tiziano Ferro";
    //CONSTRUCTOR
    public Audio(int duration, int volume) {
        super(duration, volume);
    }
    //METODO TO STRING()//
    @Override
    public String toString() {
        return "Audio{" +
                "Titolo='" + Titolo + '\'' +
                ", duration=" + duration +
                ", volume=" + volume +
                '}';
       }

    //0VERRIDE//
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
}
