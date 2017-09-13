import java.util.Scanner;

/**
 * Created by Szablewksi on 9/11/2017.
 */
public class Ex2 {

    public static double employeePayment;
    public static final int taxLevel = 85528;
    public static final double normalTaxBase = 556.02;
    public static final double bigTaxBase = 14839.02;
    public static final double normalTaxFactor = 0.16;
    public static final double bigTaxFactor = 0.32;


    public void getEmployeePayment(double employeePayment, int taxLevel){
    }

    public void calculateTaxExpense(double employeePayment, double taxBase, double taxFactor){
    }

    public static void main(String[] args){

        System.out.println("Specify how much you earn per month? ");
        Scanner scanner = new Scanner(System.in);
        employeePayment = scanner.nextDouble();

        if (employeePayment <= taxLevel) {
            double taxExpense = (employeePayment * normalTaxFactor) - normalTaxBase;
            System.out.println("Your tax is equal " + taxExpense);
        }

        if (employeePayment > taxLevel){
            double bigTaxExpense = (employeePayment * bigTaxFactor) - bigTaxBase;
            System.out.println("Your tax is equal " + bigTaxExpense);
        }
    }
}
