package java_Übungen;

import java.util.Scanner;

public class Ü018 {

    public static void main(String[] args) {

        /*
          Kullanicidan bir sifre isteyin
          asagidaki sartlari kontrol ederek
          kullaniciya duzeltmesi gerekenleri soyleyin
          eger tum sartlari saglarsa
          "sifre basariyla kaydedildi" yazdirin
          - ilk harf kucuk harf olmali
          - son karakter rakam olmali
          - sifre bosluk icermemeli
          - uzunlugu en az 10 karakter olmali
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre = scan.nextLine();


        char ilkKarakter = sifre.charAt(0);
        char sonKarakter = sifre.charAt(sifre.length() - 1);

        boolean flag = true;


        if (ilkKarakter < 'a' || ilkKarakter > 'z') {
            System.out.println("ilk harf kücük olmali");
            flag = false;
        }

        if (sonKarakter < '0' || sonKarakter > '9'){
            System.out.println("son karakter rakam olmali");
            flag = false;
        }

        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            flag = false;
        }

        if (sifre.length() < 10) {
            System.out.println("sifre uzunlugu en az 10 karakter olmali");
            flag = false;
        }

        if (flag) System.out.println("sifre basariyla kaydedildi");


    }
}