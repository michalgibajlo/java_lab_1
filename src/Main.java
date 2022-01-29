import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli */

        System.out.print("Podaj imię:");
        Scanner scan_imie = new Scanner(System.in);
        String imie = scan_imie.nextLine();

        System.out.print("Podaj nazwisko:");
        Scanner scan_nazwisko = new Scanner(System.in);
        String nazwisko = scan_nazwisko.nextLine();

        System.out.print("Podaj wiek:");
        Scanner scan_wiek = new Scanner(System.in);
        String wiek = scan_wiek.nextLine();

        System.out.print("Podaj numer indeksu:");
        Scanner scan_indeks = new Scanner(System.in);
        String indeks = scan_indeks.nextLine();

        //   b) wyświetlić dane za pomocą println i printf

        System.out.println(imie+" "+nazwisko+" "+wiek+" "+indeks);

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu*/
        int a = 3;
        int b = 4;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


    }
}
