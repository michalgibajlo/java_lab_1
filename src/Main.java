import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        System.out.println("ARYTMETYCZNE");
        int a,b,c,x,y;
        a=12; b=2; c=7; x=12; y=20;

        System.out.println(a*(b+c)-x/a);
        System.out.println((y+x)^2-(a+b)*c);

        System.out.println("LOGICZNE");
        boolean t,f;
        t=true; f=false;

        System.out.println((f && f) || t);
        System.out.println((!t || f) && t);
    }
}
