import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        boolean var = true;

        int sizeOfArray = scanner.nextInt();
        int[] unsortedArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++){
            unsortedArray[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < unsortedArray.length -1; i++){
            if (unsortedArray[i] == n && unsortedArray[i + 1] == m || unsortedArray[i] == m && unsortedArray[i + 1] == n){
                var = false;
                break;
            }
        }

        System.out.println(var);

    }
}