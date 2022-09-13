package java_Übungen;

public class Ü033FaktoriyelMitMethode {


    public static void main(String[] args) {
        int zahl=4;

       int fakSonuc= faktoriyel(zahl);
        System.out.println(zahl + " sayisinin faktoriyeli = > " + zahl + " ! = " + fakSonuc );


    }


    public static int faktoriyel(int sayi) {

        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {

            faktoriyel *= i;

        }


        return faktoriyel;

    }


}
