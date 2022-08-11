package java_Übungen;

import java.util.Scanner;

public class Ü014_Contains {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle gir basgan");

        String cümle = scanner.nextLine();

        if (cümle.contains("ev") && cümle.contains("is")) System.out.println("hem ev hem is sahane");

        else if (cümle.contains("ev")) System.out.println("evin olmasi güzelmistir");

        else if (cümle.contains("is")) System.out.println("isin olmasi güzelmistir");

        else System.out.println("meteliksizmissin aga");






    }

}
