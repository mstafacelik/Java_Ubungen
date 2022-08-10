package java_Übungen;

import java.util.Scanner;

public class Ü011_SchaltJahr {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie ein Jahr ein");
        int jahr = scan.nextInt();

        if (jahr > 0) {


            if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
                System.out.println("Jahr ist " + jahr + " und Schalrtjahr");
            } else {
                System.out.println("Jahr ist " + jahr + " und kein Schalrtjahr");
            }

        } else System.out.println("Die Eingabe ist negativ also ungültig!");


    }


}
