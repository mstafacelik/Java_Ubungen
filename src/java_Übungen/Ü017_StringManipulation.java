package java_Übungen;

import java.util.Locale;

public class Ü017_StringManipulation {
    public static void main(String[] args) {

        //  "jaVa2 &ogren5Mek N4E Gu7#7.zEldi;R" cümlesini düzeltin

        String str = "jaVa2 &ogren5Mek N4E Gu7#7.zEldi;R";


        str = str.replaceAll("\\d", "");  // rakamlardan kurtulduk
        str = str.replaceAll("\\s", "1"); // space leri rakama atadik
        str = str.replaceAll("\\W", "");  // ozel karakterlerden kurtulduk
        str = str.replaceAll("\\d", " "); // eski space leri geri getirdik
        str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase(); // ilk harf buyuk digerleri kucuk

        System.out.println(str);


    }
}
