package java_Übungen;

import java.util.Scanner;

public class Ü008_StrTerstenYazdirma {


    public static void main(String[] args) {

     /*
        Girilen String değerde tersten yazan Java kodunu yazınız.

        Test Data:
        java
                avaj
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz : ");
        String str = scan.nextLine();

        String arr[] = str.split("");

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

    }
}
