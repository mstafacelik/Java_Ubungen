package java_Übungen;

public class Ü032ArrayEnthältDataMitMethode {

    public static void main(String[] args) {

        int[] arr = {20, 40, 60};
        int gesuchteZahl = 21;

        uberprüfung(arr, gesuchteZahl);

    }

    public static void uberprüfung(int[] arr, int gesuchteZahl) {


        boolean enthält = false;
        for (int zahl : arr) {

            if (zahl == gesuchteZahl) {

                enthält = true;
                System.out.println("gesuchte Zahl ist verfügbar");
                break;

            }

            System.out.println("gesuchte Zahl ist nicht verfügbar");
            break;

        }


    }


}
