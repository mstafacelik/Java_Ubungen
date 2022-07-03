package java_Übungen;

import java.util.Scanner;

public class Ü005_ElmasDeseni {
    public static void main(String[] args) {


        /*
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
    */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int zahl = scanner.nextInt();

        int count = 1;

        for (int i = 1; i <= zahl * 2 - 1; i++) {

            for (int j = count; j <= zahl; j++) {   // bosluk ekleme icin

                System.out.print(" ");
            }

            for (int k = 1; k <= count * 2 - 1; k++) {
                System.out.print("*");
            }

            if (i < zahl) {
                count++;
            } else
                count--;
            System.out.println();

        }


    }
}