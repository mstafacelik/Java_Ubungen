package java_Übungen;

public class Ü029_ForLoopMitArray {

    public static void main(String[] args) {

        // array in elemanlari toplamini yazdirin


        int[] arrray = {5, 10, 15, 20};

        int summe = 0;

        for (int i = 0; i < arrray.length; i++) {   // parantez icinde yer alan i++ yi body icine de alabiliriz

            summe += arrray[i];


        }

        System.out.println("summe = " + summe);


    }


}
