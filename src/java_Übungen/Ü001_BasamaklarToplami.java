package java_Übungen;

import java.util.Scanner;

public class Ü001_BasamaklarToplami {

    public static void main(String[] args) {

        /*1---
    Addieren Sie die Ziffern einer Zahl
    Beispiel --> Test Data --> 34
    erwartetes Ergebnis--> 3+4= 7
    */


        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");

        int num = scan.nextInt();

        int count = 0;
        int toplam = 0;

        while (num != 0) {
            toplam += (num % 10);
            num /= 10;
            count++;
        }

        System.out.println("Basamak Toplamı: " + toplam + " olup girilen sayi " + count + " basamaklidir");


    }
}
