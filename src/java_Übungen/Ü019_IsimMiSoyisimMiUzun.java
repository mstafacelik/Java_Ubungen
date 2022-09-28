package java_Übungen;

import java.util.Scanner;

public class Ü019_IsimMiSoyisimMiUzun {
    public static void main(String[] args) {
        /*
         Kullanicidan isim ve soyismini ayri ayri alin
         ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
         soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("isim ve soyisim giriniz.\nAlta gecmek icin Enter'a basin");
        String isim = scanner.next();
        String soyIsim = scanner.next();


        //1. yol ternary
        String str = isim.length() > soyIsim.length() ?
                (isim.substring(0, 1).toUpperCase() +
                        isim.substring(1).toLowerCase() + " " + soyIsim.substring(0, 1).toUpperCase() +
                        soyIsim.substring(1).toLowerCase()) : isim.substring(0, 1).toUpperCase() +
                isim.substring(1).toLowerCase() + " " + soyIsim.toUpperCase();
        System.out.println(str);

        // 2. Yol
        if (isim.length() > soyIsim.length()) {

            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase());
            System.out.println(soyIsim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase());

        } else if (soyIsim.length() > isim.length()) {


            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase());
            System.out.println(soyIsim.toUpperCase());

        } else System.out.println("isim ve soy isim uzunlugu birbirine esittir");


    }
}
