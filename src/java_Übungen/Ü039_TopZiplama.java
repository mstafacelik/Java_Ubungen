package java_Übungen;

import java.util.Scanner;

public class Ü039_TopZiplama {

    public static void main(String[] args) {

        // Bir top belirli yükseklikten atılmaktadır.
        // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen topun birakildigi ilk yuksekligi giriniz");
        double yukseklik = scan.nextDouble();

        double ziplamaCount = 0;
        double toplamMesafe = 0;

        do {

            ziplamaCount++;

            toplamMesafe += yukseklik;

            yukseklik *= 0.75;

            toplamMesafe += yukseklik;


        } while (yukseklik >= 1);

        System.out.println("toplamMesafe = " + toplamMesafe);
        System.out.println("ziplamaCount = " + ziplamaCount);


    }

}
