package java_Übungen;

public class Ü031ArrayElemanKontrol {

    public static void main(String[] args) {

        // Ali isminin Array icinde yer alip almadigi sorgulayan bir program yaziniz

        String[] arr = {"Ali", "Veli", "Ali", "Ahmet", "Ahmet", "Ahmet"};

        String str = "Ali";


        // 1. yöntem

       /* for (int i = 0; i < arr.length; i++) {


            if (str.equals(arr[i])) {

                System.out.println("Array ismi iceriyor");

                break;

            } else {
                System.out.println("Array ismi icermiyor");
                break;

            }
*/
            // 2. yöntem   ->>>> flag yöntemi

            boolean enthält=false;
            for (int j = 0; j < arr.length; j++) {

                if (str.equals(arr[j])) {

                    enthält = true;
                    break;

                }

            }
            if (enthält) System.out.println("Array ismi iceriyor");
            else System.out.println("Array ismi icermiyor");


        }
    }
