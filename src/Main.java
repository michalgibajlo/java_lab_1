public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

        Double[] tab1 = new Double[5];

        tab1[0] = 29.09;
        tab1[1] = 21.00;
        tab1[2] = 3.00;
        tab1[3] = 100.50;
        tab1[4] = 1.98;

        //System.out.println(tab1.length);
        for (int i = 0; i < tab1.length; i++)
        {
            System.out.print(tab1[i] + "; ");
        }

    }
}