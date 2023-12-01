import entities.Audio;
import entities.ContenutoMultimediale;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //SCANNER//
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Per favore, inserisci i tuo dati e premi invio");
        String name = myscanner.nextLine();
        String surname = myscanner.nextLine();
        System.out.println("Hai inserito: " + name + " "+surname);
        myscanner.close();

        //CONTENUTO//
        ContenutoMultimediale musica=new Audio(10 ,40);
        musica.play();
          System.out.println(musica);


    }
}