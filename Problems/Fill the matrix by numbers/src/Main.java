import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close(); // remember to close all your resources!
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) { //iterate over rows
            for (int j = 0; j < n; j++) { //iterate over columns
                array[i][j] = Math.abs(j - i); //calculate cell's value
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
