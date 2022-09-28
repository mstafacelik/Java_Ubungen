package java_Übungen;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ü021BesIleBolunenSayilar {
    public static void main(String[] args) {

        // kullanicidan baslangic ve bitis sayilarini alin
        // sinirlar dahil olmak uzere
        // sinirlar ve aralarindaki sayilardan 5 ile bolunebilenleri yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("baslangic sayisini girin");
        int bas = scan.nextInt();
        System.out.println("bitis degerini girin");
        int bit = scan.nextInt();


        // Lambda ile

        IntStream.range(bas, bit).filter(t -> t % 5 == 0).forEach(t -> System.out.println(t + " "));


        System.out.println(" =========");


        // Core java ile

        for (int i = bas; i < bit; i++) {

            if (i % 5 == 0) System.out.println(i);

        }


        // kullanicidan baslangic ve bitis sayilarini alin
        // sinirlar dahil olmak uzere
        // sinirlar ve aralarindaki sayilardan 5 ile bolunebilenleri yazdirin
        // NOT : kullanici once buyuk sayi, sonra kucuk sayi girebilir

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("baslangic sayisini girin");
        int bitis = scan.nextInt();
        System.out.println("bitis degerini girin");
        int baslangic = scan.nextInt();


        for (int i = bitis; i > baslangic; i--) {

            if (i % 5 == 0) System.out.println(i);


        }


    }
}
