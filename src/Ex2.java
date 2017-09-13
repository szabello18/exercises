import java.util.Scanner;

/**
 * Created by Szablewksi on 9/11/2017.
 */
public class ex2 {

    public static void main(String[] args){

        double employeePayment;

        System.out.println("Specify how much you earn per month? ");
        Scanner scanner = new Scanner(System.in);
        employeePayment = scanner.nextDouble();

        if (employeePayment <= 85528) {
            double taxExpense = (employeePayment * 0.18) - 556.02;
            System.out.println("Your tax is equal " + taxExpense);
        }

        if (employeePayment > 85528){
            double bigTaxExpense = (employeePayment *0.32) - 14839.02;
            System.out.println("Your tax is equal " + bigTaxExpense);
        }
    }
}
