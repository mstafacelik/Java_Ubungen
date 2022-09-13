package java_Übungen;

import java.util.Scanner;

public class Ü024RakamlarToplami {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir sayi alip
        // sayinin rakamlar toplamini yazdirin

        // islemin kac kere tekrar edilecegini bulmak icin
        // basamak sayisina ihtiyacim var

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi girin");
        Integer sayi = scan.nextInt();

        int rakamlarToplami = 0;

        int basamakSayisi = (int) sayi.longValue();

        // Basamak sayisini bulmak icin alternatif ;
        // String str=sayi + "";
        // int basamakSayisi=str.length();


        for (int i = 0; i < basamakSayisi; i++) {

            rakamlarToplami += sayi % 10;   // birler basamigini rakamlar toplamina ekler
            sayi = sayi / 10;               // isimizin bittigi birler basamgini yok eder

        }


        System.out.println("rakamlarToplami = " + rakamlarToplami);


    }
}
