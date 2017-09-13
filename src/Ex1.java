
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        List<Integer> inputUserList = new ArrayList<Integer>();

        int liczba = 0;
        int max = 0;
        int min = 0;

        System.out.println("Podaj 3 liczby całkowite");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            liczba = sc.nextInt();
            inputUserList.add(liczba);
        }

        for (Integer inputUserMin : inputUserList) {
            for (int i = 0; i < inputUserList.size(); i++) {
                if (min > liczba) {
                    min = liczba;
                    System.out.println("Najmniejszy element w tablicy to " + inputUserMin);
                }
            }

        }
        for (Integer inputUserMax : inputUserList) {
            for (int i = 0; i < inputUserList.size(); i++) {
                if (max < liczba) {
                    max = liczba;
                    System.out.println("Największy element w tablicy to " + inputUserMax);
                }
            }

        }
    }
}



