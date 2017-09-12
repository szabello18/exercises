
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args){

        int liczba = 0;
        int max = 0;
        int min = 0;

        System.out.println("Podaj 3 liczby całkowite");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            liczba = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (min > liczba) {
                min = liczba;
            }
        }
        System.out.println("Najmniejszy element w tablicy to " + min);

        for (int i = 0; i < 3; i++) {
            if(max < liczba){
                max = liczba;
            }
        }
        System.out.println("Największy element w tablicy to " + max);
    }
}




