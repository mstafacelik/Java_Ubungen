package java_Übungen;

import java.util.Scanner;

public class Ü037_BolmeOperatorüKullanmadanBolme {

  //  static int bolum;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen iki sayi giriniz (Bolunen ve bolen). Ikinci sayiyi girmek icin Enter a basiniz");

        int bolunen = scanner.nextInt();
        int bolen = scanner.nextInt();

        System.out.println("getBolum(bolunen, bolen) = " + getBolum(bolunen, bolen));



    }

    public static int getBolum(int a, int b) {

        int count=0;
        while (a >= b) {

            a -= b;
            count++;

        }


        return count;

    }
}
