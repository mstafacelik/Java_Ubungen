package java_Übungen;

public class Ü035ArrayElemanlariBüyüktenKücügeSiraliMi {


    public static void main(String[] args) {

        // sayilarin kucukten büyüge sirali olup olmadigini kotrol edin


        int[] sayilar = {1, 3, 5, 9, 90, 0};


        System.out.println("Array elemanlari sirali mi : " + getSiralimi(sayilar));


    }

    public static boolean getSiralimi(int[] zahlen) {


        boolean siraliMi = true;

        for (int i = 0; i < zahlen.length - 1; i++) {


            if (zahlen[i] > zahlen[i + 1]) {

                siraliMi = false;
                break;


            }


        }
        return siraliMi;


    }


}
