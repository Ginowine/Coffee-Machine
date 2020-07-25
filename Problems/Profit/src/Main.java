import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        double moneyInBank = scanner.nextDouble();
        double interest = scanner.nextDouble();
        double expectedAmount = scanner.nextDouble();
        int numberOfYears = 0;

        while (expectedAmount > moneyInBank){
            moneyInBank = moneyInBank + moneyInBank * (interest/100);
            numberOfYears = numberOfYears+1;
        }
        System.out.println(numberOfYears);
    }
}