package java_Übungen;

public class Ü034ArraySayilarKarsilastimaEnBüyükSayi {
    public static void main(String[] args) {


        int[] zahlen1 = {1, 4, 60, 7, 9};
        int[] zahlen2 = {1, 4, 60, 7, 90};


        System.out.println(getGrösteZahl(zahlen1));
        System.out.println(getGrösteZahl(zahlen2));


    }


    public static int getGrösteZahl(int[] sayilar) {


        int grösteZahl = Integer.MIN_VALUE; // oder  int grösteZahl = 0;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] > grösteZahl) {

                grösteZahl = sayilar[i];


            }


        }

        return grösteZahl;

    }


}
