package javaTreningSobie;
import java.awt.*;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String args[]){

        double a,b,c,delta,x1,x2,x0;
        Scanner console = new Scanner(System.in);
        System.out.println("Podaj a: ");
        a = console.nextDouble();
        System.out.println("Podaj b: ");
        b = console.nextDouble();
        System.out.println("Podaj c: ");
        c = console.nextDouble();

        delta = Math.pow(b,2)-4*a*c;
        x0 = -b/2*a;
        x1 = (-b-Math.sqrt(delta))/2*a;
        x2 = (-b+Math.sqrt(delta))/2*a;

        if(delta < 0){
            System.out.println("Rownanie nie ma rozwiazan -> SORY MORDO");
    }
        else if (delta == 0){
            System.out.println("Rownanie ma jedno rozwiazanie podwojne: " + x0);
        }
        else{
            System.out.println("Rownanie ma dwa rozwiazania: x1 = "+ x1 +" oraz x2 = "+ x2);
        }
    }

}
