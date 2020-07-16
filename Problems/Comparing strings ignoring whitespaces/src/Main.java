import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine().replace(" ", "");
        String input2 = scanner.nextLine().replace(" ", "");

        if (input1.equals(input2)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}