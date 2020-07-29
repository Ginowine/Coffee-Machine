import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++){
            for (int j = 0; j < i; j++){
                System.out.print(i + " ");
                counter++;
                if (counter == input){
                    break;
                }
            }
            if (counter == input){
                break;
            }
        }
    }
}