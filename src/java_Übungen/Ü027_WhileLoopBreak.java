package java_Übungen;

public class Ü027_WhileLoopBreak {
    public static void main(String[] args) {


        int zahl = 1;

        while (true) {

            System.out.println("zahl = " + zahl);
            zahl++;

            if (zahl > 100) {


                break;

            }


        }


    }
}
