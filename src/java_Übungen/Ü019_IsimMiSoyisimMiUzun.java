package java_Übungen;

import java.util.Scanner;

public class Ü019 {
    public static void main(String[] args) {
        /*
         Kullanicidan isim ve soyismini ayri ayri alin
         ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
         soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin
         */


        Scanner scanner=new Scanner(System.in);
        System.out.println("isim ve soyisim giriniz.\nAlta gecmek icin Enter'a basin");
        String isim=scanner.next();
        String soyIsim=scanner.next();



        if (isim.length()>soyIsim.length()){

            System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase());
            System.out.println(soyIsim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase());

        }else if(soyIsim.length()>isim.length()){


            System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase());
            System.out.println(soyIsim.toUpperCase());

        }else System.out.println("isim ve soy isim uzunlugu birbirine esittir");



    }
}
