import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        int max = 0;

        Scanner scanner = new Scanner(System.in);
        int input = 0;

        do {
            input = scanner.nextInt();
            if (input > max){
                max = input;
            }
        }while (input != 0);

        System.out.println(max);


    }
}