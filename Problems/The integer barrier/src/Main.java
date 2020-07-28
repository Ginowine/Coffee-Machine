import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        int sum = 0;
        int value = 0;
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        while (number != 0){
            sum += number;
            number = scanner.nextInt();
            if (sum >= 1000){
                sum = sum - 1000;
            }
        }
        System.out.println(sum);

    }
}