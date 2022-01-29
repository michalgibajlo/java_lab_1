import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */

        int age = 27;
        if (age%3==0 )
        {
            System.out.println("Wiek podzielny przez 3");
        }
        else
        {
            System.out.println("Wiek niepodzielny przez 3");
        }


        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        int indeks=68635;

        String modulo=indeks%2==0 ? "Parzyste" : "Nieparzyste";
        System.out.println(modulo);

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        System.out.print("wprowadź liczbę:");
        Scanner scan_liczba = new Scanner(System.in);
        String liczba = scan_liczba.nextLine();

        Double liczbaDB = Double.parseDouble(liczba);

        String pytanie=liczbaDB>=0 ? "Większa od zera" : "Mniejsza od zera";

        System.out.println(pytanie);

    }
}
