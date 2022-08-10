package java_Übungen;

import java.util.Scanner;

public class Ü010_YillikKacKgSeker {
    public static void main(String[] args) {

        /*
     Kullaniciya
     * 1 = Gunde kac bardak cay ictigini,
     * 2 = Her bardak icin kac kup seker kullandigini sorup;

     kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda  consolda yazdiran bir program yazin.
     * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
      (1 kup seker = 2.77 gr)

*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Günde kac bardak cay iciyorsunuz?");
        int bardakSayisi = scan.nextInt();

        System.out.println("Her bardak icin kac adet küp seker kullaniyorsunuz?");
        int sekerSayisi = scan.nextInt();

        double yillikSekerKg = (bardakSayisi * sekerSayisi * 365 * 2.77 / 1000);
        double kirkYillikSekerKg = yillikSekerKg * 40;

        int yillikTuketimInt= (int) yillikSekerKg;
        int kirkYillikTuketim= (int) kirkYillikSekerKg;

        if (sekerSayisi > 0 && bardakSayisi>0) {

            System.out.println("Bir yilda " + yillikTuketimInt + " kg seker tüketiyorsunuz");
            System.out.println("40 yilda " + kirkYillikTuketim + " kg seker tüketiyorsunuz");

        } else System.out.println("Aferin, boyle devam et :)");

        scan.close();


    }
}
