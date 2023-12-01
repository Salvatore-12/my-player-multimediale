package entities;

public abstract class ContenutoMultimediale {
    //ATTRIBUTE//
    public int duration;
    public int volume=0;
    //CONSTRUCTOR//
    public ContenutoMultimediale(int duration, int volume) {
        this.duration = duration;
        this.volume = volume;

    }

    //METODI//
 public abstract void play();

}
