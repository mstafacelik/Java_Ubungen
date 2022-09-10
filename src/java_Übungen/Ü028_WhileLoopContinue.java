package java_Übungen;

public class Ü028_WhileLoopContinue {

    public static void main(String[] args) {


        int zahl = 1;


        while (true) {

            zahl++;

            if (zahl == 95) {

                continue;

            }
            if (zahl > 100) {
                break;
            }
            System.out.println("zahl = " + zahl);


        }


    }


}
