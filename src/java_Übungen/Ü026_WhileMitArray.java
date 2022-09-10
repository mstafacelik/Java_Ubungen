package java_Übungen;

public class Ü026_WhileMitArray {

    public static void main(String[] args) {


        int[] zahlen = {1, 20};

        int i = 0;
        int length = zahlen.length;
        int summe = 0;

        while (i < length) {


            summe += zahlen[i];
            i++;

        }
        System.out.println("summe = " + summe);


    }


}
