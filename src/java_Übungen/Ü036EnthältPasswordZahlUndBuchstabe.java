package java_Übungen;

public class Ü036EnthältPasswordZahlUndBuchstabe {

    public static void main(String[] args) {


        String password = "12345";


        boolean zahl = false;
        boolean buchstabe = false;


        for (int i = 0; i < password.length(); i++) {


            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {

                System.out.println(password.charAt(i) + " bir rakamdir");

                zahl = true;

            }

            if ((password.charAt(i) >= 'a' && password.charAt(i) <= 'z') ||
                    (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')) {

                System.out.println(password.charAt(i) + " bir kücük harftir");

                buchstabe = true;

            }


        }

        boolean ergebnis = zahl && buchstabe;

        System.out.println("harf ve sayi var mi " + ergebnis);


    }


}
