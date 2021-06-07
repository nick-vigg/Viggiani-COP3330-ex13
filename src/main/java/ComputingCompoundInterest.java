import java.util.Scanner;

public class ComputingCompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the principal amount?");
        double principal = input.nextDouble();
        System.out.println("What is the rate?");
        double rate = input.nextDouble();
        System.out.println("What is the number of years?");
        int years = input.nextInt();
        System.out.println("What is the num1ber of times the interest is compounded yearly?");
        int perYear = input.nextInt();
        double worth = principal*Math.pow((1+(rate/100)/perYear), (perYear*years));
        String output = String.format("$%.2f invested at %.1f%% for %d years compounded %d times per year is $%.2f",
                                        principal, rate, years, perYear, worth);
        System.out.println(output);
    }
}
