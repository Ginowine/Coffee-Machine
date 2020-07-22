import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int x = 0; x < 1000; x++ ){
            int root = a * x * x * x + b * x * x + c * x + d;
            if (root == 0){
                System.out.println(x);
            }
        }
    }
}