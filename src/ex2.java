import java.util.Scanner;
public class Ex2 {

    public static double employeePayment;
    public static final int TAX_LEVEL = 85528;
    public static final double NORMAL_TAX_BASE = 556.02;
    public static final double BIG_TAX_BASE = 14839.02;
    public static final double NORMAL_TAX_FACTOR = 0.16;
    public static final double BIG_TAX_FACTOR = 0.32;

    public void getEmployeePayment(){
        System.out.println("Specify how much you earn per month? ");
        Scanner scanner = new Scanner(System.in);
        employeePayment = scanner.nextDouble();
    }

    public void matchTaxExpense(double employeePayment,int TAX_LEVEL, double NORMAL_TAX_BASE, double NORMAL_TAX_FACTOR, double BIG_TAX_BASE, double BIG_TAX_FACTOR){
        if (employeePayment > TAX_LEVEL){
            double caluclateTaxExpanse = (employeePayment * BIG_TAX_FACTOR) - BIG_TAX_BASE;
            System.out.println("Your tax is equals " + caluclateTaxExpanse );
        }
        if (employeePayment <= TAX_LEVEL) {
            double caluclateTaxExpanse = (employeePayment * NORMAL_TAX_FACTOR) - NORMAL_TAX_BASE;
            System.out.println("Your tax is equal " + caluclateTaxExpanse);
        }
    }

    public static void main(String[] args){

        Ex2 ex2 = new Ex2();

        ex2.getEmployeePayment();
        ex2.matchTaxExpense(employeePayment,TAX_LEVEL, NORMAL_TAX_BASE, NORMAL_TAX_FACTOR,BIG_TAX_BASE,BIG_TAX_FACTOR);
    }
}
