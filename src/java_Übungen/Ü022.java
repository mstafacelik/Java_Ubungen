package java_Übungen;

import java.util.Scanner;

public class Ü022 {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tam sayi alin
        // 1'den o sayiya kadar (sayi dahil) tum sayilarin toplamini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi girin");
        int sayi = scan.nextInt(); // 25


        if (sayi < 0) {
            System.out.println("lütfen pozitif sayi giriniz !");
        }
        else{


            int sayilarToplami=0;

            for(int i=1; i<=sayi; i++){


               sayilarToplami+=i;



            }
            System.out.println("1 den " + sayi + "'e kadar olan sayilarToplami = " + sayilarToplami);

        }


    }
}
