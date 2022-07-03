package java_Übungen;

public class Ü004_YarimPiramit {
    public static void main(String[] args) {

/*
    1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.

     Beklenen çıltı:

    1
    12
    123
    1234
    12345
    123456
    1234567
    12345678
    123456789
    12345678910
    */

        mitForLoop();
        mitWhileLoop();

    }

    public static void mitForLoop() {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*"); // println oldugu icin alt satira gecmeden loop ciktilarini yan yana yazar

            }
            System.out.println();    // print oldugu icin alt satira gecmemizi sagliyor

        }


    }

    public static void mitWhileLoop() {


        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;


        }


    }

}