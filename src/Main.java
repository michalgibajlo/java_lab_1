import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        int n = 1;
        int x,y, wynik;
        String c = "Kasia";
        double d = 1.0;
        double e,f, wynikdouble;
        long l = 9;
        //    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        //    mnożenia, dziealenia i modulo na zmiennych:
        //   a) liczbaA i liczbaB, dowolne liczby calkowite (int),

        //LICZBY:
        x=7;
        y=12;

        wynik = x+y;
        System.out.println("Dodawanie: " + wynik );
        wynik = x-y;
        System.out.println("Odejmowanie: " + wynik );
        wynik = x*y;
        System.out.println("Mnożenie: " + wynik );
        wynik = x/y;
        System.out.println("Dzielenie: " + wynik );
        wynik = x%y;
        System.out.println("Modulo: " + wynik );
        //   b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        e=7;
        f=12;

        wynikdouble = e+f;
        System.out.println("Dodawanie: " + wynikdouble );
        wynikdouble = e-f;
        System.out.println("Odejmowanie: " + wynikdouble );
        wynikdouble = e*f;
        System.out.println("Mnożenie: " + wynikdouble );
        wynikdouble = e/f;
        System.out.println("Dzielenie: " + wynikdouble );
        wynikdouble = e%f;
        System.out.println("Modulo: " + wynikdouble );

    }
}
