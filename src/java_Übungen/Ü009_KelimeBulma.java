package java_Übungen;

public class Ü009_KelimeBulma {
    public static void main(String[] args) {

    /*
    Kullanıcıdan alınan String kümesi içerisinde aranan String i bulan Java Kodunu yazınız.

    Test Data:
    Java is easy

    Aranan String: va

    Bektenen Çıktı:
    True

    Aranan String: and

    Beklenen Çıktı:False

    */

        String str="Java ist java";
        boolean b;
        b=str.contains("va");
        // b=str.contains("and");
        System.out.println(b);

    }
}
