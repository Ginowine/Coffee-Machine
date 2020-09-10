import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int seats = scanner.nextInt();
        String[][] cinema = new String[rows][seats];

        //create "cinema" matrix"
        for (int r = 0; r < rows; r++) {
            for (int s = 0; s < seats; s++) {
                cinema[r][s] = scanner.next();
            }
        }
        //find consecutive seats, k
        int k = scanner.nextInt();

        //whatRow will be the marker when the correct row is found
        int positiveRow = 0;
        //loop over rows
        rowloop: for (int r = 0; r < rows; r++) {
            //loop over all the seats in a row
            for (int s = 0; s < seats; s++) {
                int counter = 0;
                //the positive counter will flag when there's two consecutive 0s.
                int positive = 0;
                //loop the number of times k past each seat.
                while (counter < k) {
                    if (cinema[r][s] == "0" && cinema[r][s + counter] == "0") {
                        positive++;
                        if (positive == k) {
                            positiveRow = r;
                            break rowloop;
                        }
                    } else {
                        positive = 0;
                        break;
                    }
                    counter++;
                }

            }

        }
        System.out.println(positiveRow+1);

    }
}
