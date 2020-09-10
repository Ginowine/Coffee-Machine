import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[][] matrix = new int[number][number];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            int fillNumber = index;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.abs(fillNumber--);
            }
            index++;
        }

        for (int[] array : matrix) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
