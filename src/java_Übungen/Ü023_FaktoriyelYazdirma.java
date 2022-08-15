package java_Übungen;

import java.util.Scanner;

public class Ü023_FaktoriyelYazdirma {
    public static void main(String[] args) {
        // kullanicidan 20'den kucuk bir pozitif tamsayi alip
        // bu sayinin faktoryel'ini yazdirin
        // 5 ! = 5 * 4 * 3 * 2 * 1 = 120 bu sekilde terminalde görünsün

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk pozitif bir tamsayi girin");
        int sayi = scan.nextInt();

        int faktoriyel = 1;

        System.out.print(sayi +" ! = ");
        for (int i = sayi; i > 0; i--) {

            faktoriyel *= i;

            if (i>1) System.out.print(i + " * ");
            else System.out.println(i);


        }
        System.out.println(" = " + faktoriyel );


    }
}
