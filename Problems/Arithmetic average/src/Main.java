import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextInt();
        double b = scanner.nextInt();
        int counter = 0;
        double sum = 0;
        double Result = 0;

        for (double i = a; i <= b; i++) {
            if (i % 3 == 0){
                counter++;
                sum = sum + i;
            }
            Result = sum / counter;
        }
        System.out.println(Result);
    }
}