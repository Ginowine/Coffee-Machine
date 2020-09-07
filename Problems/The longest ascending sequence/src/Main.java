import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int answer = 0;

        int size = scanner.nextInt();
        int[] input = new int[size];

        for (int i = 0; i < size; i++){
            input[i] = scanner.nextInt();
        }

        Arrays.sort(input);

        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < input.length; i++){
            if (input[i] != input[i -1]){
                if (input[i] == input[i -1] +1){
                    currentStreak +=1;
                }else {
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }

        System.out.println(Math.max(longestStreak, currentStreak));

    }
}