package java_Übungen;

import java.util.Scanner;

public class Ü012_ContainsSorusu {

    public static void main(String[] args) {


        /*
          Kullanicidan bir cumle ve bir kelime isteyin
          cumlede kelimenin kullanimina gore
          asagidaki cumlelerden uygun olani yazdirin
          - cumle aradiginiz kelimeyi icermiyor
          - aradiginiz kelime cumlede sadece 1 tane var
          - aradiginiz kelime cumlede birden fazla var
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cümle = scanner.nextLine();

        System.out.println("Bir kelime giriniz");
        String kelime = scanner.next();


        // 1.yol
        if (cümle.contains(kelime)) {


            if (cümle.indexOf(kelime) == cümle.lastIndexOf(kelime)) {
                System.out.println("aradiginiz kelime cumlede sadece 1 tane var");

            } else System.out.println("aradiginiz kelime cumlede birden fazla var");


        } else System.out.println("cumle aradiginiz kelimeyi icermiyor");


        // 2.yol
        int ilkIndex = cümle.indexOf(kelime);
        int ikinciIndex = cümle.indexOf(kelime, ilkIndex + 1);

        if (!cümle.contains(kelime)) System.out.println("cumle aradiginiz kelimeyi icermiyor");

        else if (ikinciIndex == -1) System.out.println("aradiginiz kelime cumlede sadece 1 tane var");
        else System.out.println("aradiginiz kelime cumlede birden fazla var");


    }


}
