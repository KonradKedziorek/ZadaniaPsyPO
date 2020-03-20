package javaTreningSobie;
import java.util.Scanner;

public class Zadanie5 {

    public static void main(String args[]){

        int a,b;
        Scanner console = new Scanner(System.in);
        System.out.println("Podaj wartosc liczby a: ");
        a = console.nextInt();
        System.out.println("Podaj wartosc liczby b: ");
        b = console.nextInt();
        System.out.println("Dodawanie: " + (a+b));
        System.out.println("Odejmowanie: " + (a-b));
        System.out.println("Mnozenie: " + (a*b));
        System.out.println("Dzielenie a/b: " + (a/b));
        System.out.println("Potega a^3: " + (Math.pow(a,3)));
        System.out.println("Pierwiastek drugiego stopnia z b: " + Math.sqrt(b));

    }
}
