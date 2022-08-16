package java_Übungen;

public class Ü025_Palindrom {
    public static void main(String[] args) {

        // Girilen String i tersten yazdirin

        String str = "ey edip adanada pide ye";


        // düz yazilisi
        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i));


        }

        // tersten yazilisi

        System.out.println();


        String tersten = "";
        for (int i = str.length() - 1; i >= 0; i--) {


            tersten += str.charAt(i);
        }
        System.out.println(tersten);


        if (str.equals(tersten)) System.out.println("Girilen cümle Palindrom");
        else System.out.println("Girilen cümle Palindrom degil");
    }
}
