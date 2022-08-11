package java_Übungen;

public class Ü018 {

    public static void main(String[] args) {


        String sifre="a lskklsdflDsdcs9";

        char ilkKarakter=sifre.charAt(0);
        char sonKarakter=sifre.charAt(sifre.length()-1);
        boolean enAzOnKarakterMi=false;
        boolean spaceVArmi=false;


        if ((   ilkKarakter>='a' && ilkKarakter<='z' ) &&
                (sonKarakter>='0'&&sonKarakter<='9')   &&
                sifre.contains(" ") &&
                sifre.length()>=10){

            System.out.println("sifre basariyla kaydedildi");
        }else{


            if (ilkKarakter<'a' || ilkKarakter>'z') System.out.println("ilk harf kücük olmali");
            if (sonKarakter<'0'||sonKarakter>'9') System.out.println("son karakter rakam olmali");
            if (!sifre.contains(" ")) System.out.println("sifre bosluk icermeli");
            if (sifre.length()<10) System.out.println("sifre uzunlugu en az 10 karakter olmali");


        }









    }

}
