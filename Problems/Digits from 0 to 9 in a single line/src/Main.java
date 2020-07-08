import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner;
        int number;
        int i;

        scanner = new Scanner(System.in);
        System.out.print("Please enter the maximum integer number:");
        number = scanner.nextInt();

        for(i = number; i >= 0; i--)
		{
			System.out.print(i + " ");
		}

    }
}
