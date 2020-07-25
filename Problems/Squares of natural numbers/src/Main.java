import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int i = 0;
////
//        for (i = 0; i<= inputValue; i++ ){
//            int square = (i * i);
//            System.out.println(square);
//        }

        while (i <= inputValue){
            int squre = (i * i);
            i++;
        }

    }
}