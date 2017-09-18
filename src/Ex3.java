import java.util.Scanner;

/**
 * Created by Szablewksi on 9/14/2017.
 */
public class Ex3 {

    private static double commodityPrice;
    private static int numberOfInstallments;
    public static final float SMAL_INTEREST_RATE = (float)0.025;
    public static final float NORMAL_INTEREST_RATE = (float)0.05;
    public static final float BIG_INTEREST_RATE = (float)0.10;

    public void getCommodityPrice(double commodityPrice){
        System.out.println("Please enter the price of the item. ");
        Scanner scannerPrice = new Scanner(System.in);
        commodityPrice = scannerPrice.nextDouble();
        if (commodityPrice < 100 || commodityPrice > 10000){
            System.out.println("Please enter a price range from 100 PLN to 10000 PLN ");
            getCommodityPrice(commodityPrice);
        }
    }

    public void getNumberOfInstallments(int numberOfInstallments){
        System.out.println("Please specify the number of installments. ");
        Scanner scannerInstallments = new Scanner(System.in);
        numberOfInstallments = scannerInstallments.nextInt();
    }

    private void costOfInstallment (double commodityPrice, int numberOfInstallments, float SMAL_INTEREST_RATE) {
        double costOfInstallment = (commodityPrice / numberOfInstallments) * SMAL_INTEREST_RATE;
        System.out.println("Monthly cost of equipment " + " " + costOfInstallment);
    }

    public void actualiCostOfInstallment(double commodityPrice, int numberOfInstallments, float SMAL_INTEREST_RATE){
        double actualiCostOfInstallment = (commodityPrice / numberOfInstallments) + costOfInstallmentt(commodityPrice, numberOfInstallments, SMAL_INTEREST_RATE);
    }

    private double costOfInstallmentt(double commodityPrice, int numberOfInstallments, float smal_interest_rate) {
        return commodityPrice;
    }

    public void normalCostOfInstallment (double commodityPrice, int numberOfInstallments, float NORMAL_INTEREST_RATE){
        double normalCostOfInstallment = (commodityPrice / numberOfInstallments) * NORMAL_INTEREST_RATE;
        System.out.println("Monthly cost of equipment " + " " + normalCostOfInstallment);
    }

    public void bigCostOfInstallment(double commodityPrice, int numberOfInstallments, float BIG_INTEREST_RATE){
        double bigCostOfInstallment = ( commodityPrice / numberOfInstallments) * BIG_INTEREST_RATE;
        System.out.println("Monthly cost of equipment " + " " + bigCostOfInstallment);
    }

    public void culateInterestRate(int numberOfInstallments, float SMAL_INTEREST_RATE, float NORMAL_INTEREST_RATE, float BIG_INTEREST_RATE){
        if (numberOfInstallments >= 6 || numberOfInstallments <= 12){
            costOfInstallment(commodityPrice, numberOfInstallments, SMAL_INTEREST_RATE);
        }
        else if (numberOfInstallments >= 13 || numberOfInstallments <= 24) {
            normalCostOfInstallment(commodityPrice, numberOfInstallments, NORMAL_INTEREST_RATE);
        }
        else if (numberOfInstallments >= 25 || numberOfInstallments <= 48) {
            bigCostOfInstallment(commodityPrice, numberOfInstallments, BIG_INTEREST_RATE);
        }
    }

    public static void main(String[] args){

        Ex3 ex3 = new Ex3();

        ex3.getCommodityPrice(commodityPrice);
        ex3.getNumberOfInstallments(numberOfInstallments);
        ex3.culateInterestRate(numberOfInstallments, SMAL_INTEREST_RATE, NORMAL_INTEREST_RATE, BIG_INTEREST_RATE);
    }
}
