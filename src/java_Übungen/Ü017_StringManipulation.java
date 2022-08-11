package java_Übungen;

import java.util.Locale;

public class Ü017_StringManipulation {
    public static void main(String[] args) {

        //  "jaVa2 &ogren5Mek N4E Gu7#7.zEldi;R" cümlesini düzeltin

        String str= "jaVa2 &ogren5Mek N4E Gu7#7.zEldi;R";


        str=str.replaceAll("\\d",""); // jaVa &ogrenMek NE Gu#.zEldi;R
        System.out.println(str);

        str=str.replaceAll("\\s","3");// jaVa3&ogrenMek3NE3Gu#.zEldi;R
        System.out.println(str);

        str=str.replaceAll("\\W","");// jaVa3ogrenMek3NE3GuzEldiR
        System.out.println(str);

        str=str.replace("3"," ");// jaVa ogrenMek NE GuzEldiR
        System.out.println(str);


        str=str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase()+"."; // Java ogrenmek ne guzeldir.
        System.out.println(str);


    }
}
