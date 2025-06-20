package Week1.DataStructures_and_Algorithms.Exercise7;


import java.util.Scanner;

public class FinancialForecast {

    public static double calculateFutureValue(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        }
        return calculateFutureValue(amount * (1 + rate), rate, years - 1);
    }

    public static double calculateFutureValueIterative(double amount, double rate, int years) {
        for (int i = 0; i < years; i++) {
            amount *= (1 + rate);
        }
        return amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial investment amount: ");
        double initialAmount = scanner.nextDouble();

        System.out.print("Enter the annual growth rate (%): ");
        double ratePercent = scanner.nextDouble();
        double rate = ratePercent / 100.0; 

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double futureValueRecursive = calculateFutureValue(initialAmount, rate, years);
        System.out.printf("Future value (using recursion) after %d years: %.2f\n", years, futureValueRecursive);

        double futureValueIterative = calculateFutureValueIterative(initialAmount, rate, years);
        System.out.printf("Future value (using loop) after %d years: %.2f\n", years, futureValueIterative);

        scanner.close();
    }
}
