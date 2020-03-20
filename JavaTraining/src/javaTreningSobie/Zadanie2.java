package javaTreningSobie;

public class Zadanie2 {

    public static void main(String args[]){

        double pi = 3.415926;
        System.out.println("Zaokraglenie do 2 miejsc po przecinku: " +String.format("%.2f",pi));
        System.out.println("Zaokraglenie do 3 miejsc po przecinku: " +String.format("%.3f",pi));
        System.out.println("Zaokraglenie do 4 miejsc po przecinku: " +String.format("%.4f",pi));
    }
}
