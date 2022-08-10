package java_Übungen;

import java.util.Scanner;

public class Übung13_replaceAll {
    public static void main(String[] args) {

    /*
    Kullanicidan ismini, soyismini ve kk numarasini alip asagidaki formatta kaydedip yazdirin

    M***** T******
    1234 **** **** ****


     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("isminizi, soyisminizi ve kk numaranizi giriniz.\nAlt Satira gecmek icin Enter'a basiniz");

        String isim = scanner.nextLine();
        String soyIsim = scanner.nextLine();
        String kkNo = scanner.nextLine();


        String yeniIsim = isim.substring(0, 1) + isim.substring(1).replaceAll("\\w", "*") + " " +
                soyIsim.substring(0, 1) + soyIsim.substring(1).replaceAll("\\w", "*");

        String yeniKKNo = kkNo.substring(0, 4) + " **** **** ****";

        System.out.println(yeniIsim + "\n" + yeniKKNo);


    }
}
