package java_Übungen;

import java.util.stream.IntStream;

public class Ü020BirdenYuzUcIleBolunenSayilar {
    public static void main(String[] args) {


        // 1'den 100'e kadar(100 dahil) sayilardan
        // 3 ile bolunebilenleri yan yana aralarinda bir bosluk birakarak yazdiralim


        // Lambda ile
        IntStream.
                range(1, 100).
                filter(t ->
                        t % 3 == 0).
                forEach(t -> System.out.println(t + ""));


        // core java ile
        System.out.println("=========");
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                System.out.print(i + " ");
            }


        }


        for (int i = 0; i < 100; i += 3) {
            System.out.println(i);

        }


    }


}
