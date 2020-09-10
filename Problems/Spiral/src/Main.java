import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] matrix = new int[n][n];
        int current = 1;
        int passes = 0;
        while (current <= n * n) {
            for (int i = passes; i < n - passes; i++) {
                matrix[passes][i] = current++;
            }
            for (int j = passes + 1; j < n - passes; j++) {
                matrix[j][n - 1 - passes] = current++;
            }
            for (int k = n - 1 - passes; k > passes; k--) {
                matrix[n - 1 - passes][k - 1] = current++;
            }
            for (int m = n - 1 - passes; m > 1 + passes; m--) {
                matrix[m - 1][passes] = current++;
            }
            passes++;
        }
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(j + 1 == n ? ints[j] + "\n" : ints[j] + " ");
            }
        }
    }
}
