package entities;

public abstract class ContenutoMultimediale {
    //ATTRIBUTE//
    public int duration;
    public int volume;

    public ContenutoMultimediale(int duration, int volume) {
        this.duration = duration;
        this.volume = volume;

    }

    //METODI//
 public abstract void play();

}
