import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();
        int[][] number = new int[n][n];
        boolean ismatch = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                number[i][j] = scanner.nextInt();
            }
        }
        int unevenchecker = (n% 2);
        if (unevenchecker != 0) {
            for (int k = 0; k < number.length - 1; k++) {

                for (int l = 0; l < number.length - 1; l++) {
                    if (number[k][l] != number[l][k]) {
                        ismatch = true;
                    }
                }
            }
            if (ismatch) {
                System.out.print("YES");
            }
        } else {
            System.out.print("NO");
        }
    }
    }