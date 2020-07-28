import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        int sum = 0;
        int value = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an int value (the program calculates the sum if the input is 0): ");
        int number = scanner.nextInt();

        while (number != 0){
            sum += number;

            System.out.println("Enter an int value (the program exits if the input is 0): ");
            number = scanner.nextInt();
        }
        System.out.println("The sum is:" + sum);

        if(sum >= 1000){
            value = sum - 1000;
        }

        System.out.println(value);
    }
}