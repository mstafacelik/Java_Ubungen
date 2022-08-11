package java_Übungen;

import java.util.Scanner;

public class Ü015_Contains {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        int sayi = scanner.nextInt();



        if (sayi%3==0 && sayi%5==0) System.out.println("cok güzel sayi imis");

        else if (sayi%3==0) System.out.println("sayi üce tam bölünür");
        else if (sayi%5==0) System.out.println("sayi bese tam bölünür");
        else System.out.println("sayi ne üce ne de bese bölünür");


    }
}
