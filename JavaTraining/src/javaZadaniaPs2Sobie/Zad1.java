package javaZadaniaPs2Sobie;
import java.util.Scanner;

public class Zad1 {
    public static void main(String args[]) {

        int x;
        double y;
        Scanner console = new Scanner(System.in);
        while (x != y) {
            System.out.println("Podaj liczbe calkowita: ");
            x = console.nextInt();
            y = x;
            if (y == 0) {
                System.out.println("ZERO");
            } else {
//                if (x - 1 > x < x + 1) {
//                    System.out.println("Podana liczba nie byla calkowita! Podaj jescze raz liczbe calkowita: ");
//                }
                if (y % 2){
                    System.out.println("Liczba jest parzysta");
                }
                else {
                    System.out.println("Liczba jest nieparzysta");
                }
                if (y > 0){
                    System.out.println("Liczba jest dodatnia");
                }
                if (y < 0){
                    System.out.println("Liczba jest ujemna");
                }

            }
        }
    }
}
