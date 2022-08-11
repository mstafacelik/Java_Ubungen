package java_Übungen;

public class Ü016_StringtoInteger {
    public static void main(String[] args) {

        /*
         String  olarak verilen iki fiyati toplayan bir kod yaziniz
         */



        String fiyat1="25 Euro";
        String fiyat2="30 Euro";


        String yeniFiyat1=fiyat1.replaceAll("[a-zA-Z]","").trim();
        String yeniFiyat2=fiyat2.replaceAll("\\D","").trim();
        // Alternatif------> String yeniFiyat2=fiyat2.replaceAll("\\D","");

        int fiyatlarToplami=Integer.parseInt(yeniFiyat1) +Integer.parseInt(yeniFiyat2);
        System.out.println("fiyatlarToplami = " + fiyatlarToplami);

        // Soru 2

        String price1="25,35$ ";
        String price2="30,23$";

        price1=price1.replaceAll("\\D","");
        price2=price2.replaceAll("\\D","");


        Double newPrice1=Double.parseDouble(price1);
        Double newPrice2=Double.parseDouble(price2);
        double fiyatlartoplami=(newPrice1+newPrice2)/100;
        System.out.println("fiyatlartoplami = " + fiyatlartoplami);


    }
}
