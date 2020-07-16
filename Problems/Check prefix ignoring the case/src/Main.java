import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String theFirstChar = word.substring(0).toUpperCase();

        if (theFirstChar.equals("J")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}