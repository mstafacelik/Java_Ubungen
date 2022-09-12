package java_Übungen;

public class Ü030ArrayElemanlariKacDefaYazilmis {
    public static void main(String[] args) {

        // Array in elemanlari kac defa yazilmis kontrol ediniz.

        String[] arr = {"Ali", "Veli", "Ali", "Ahmet", "Ahmet", "Ahmet"};


        String isimler = "";
        for (int i = 0; i < arr.length; i++) {


            if (!isimler.contains(arr[i])) {

                int sayi = 1;
                for (int j = i + 1; j < arr.length; j++) {


                    if (arr[i].equals(arr[j])) {

                        sayi++;
                    }

                }

                System.out.println(arr[i] + " => " + sayi + " defa Array de yer almaktadir");

                isimler += arr[i];
            }


        }


    }


}
