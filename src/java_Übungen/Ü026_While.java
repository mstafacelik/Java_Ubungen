package java_Übungen;

public class Ü026_While {
    public static void main(String[] args) {

        // bir sayinin kac basamakli oldugu ve basamaklar toplamini yazdirin

        int zahl=11;

        int summe=0;
        int count=0;

        while(zahl>0){


            summe+=zahl%10;

            zahl/=10;

            count++;


        }

        System.out.println("summe = " + summe + " und " + count + "-stellige Zahl.");


    }



}
