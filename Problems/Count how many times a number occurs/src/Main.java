import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int counter = 0;

        int sizeOfArray = scanner.nextInt();
        int[] numbers = new int[sizeOfArray];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        n = scanner.nextInt();

//        for (int i = 0; i < numbers.length; i++){
//            if (numbers[i] == n){
//                counter++;
//            }
//        }

        for (int number : numbers){
            if (number == n){
                counter++;
            }
        }
        System.out.println(counter);
    }
}