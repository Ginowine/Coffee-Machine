import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        int heightOfBus;
        int numberofBridges;

//        int heightOfBridge1;
//        int heightOfBridge2;
//        int heightOfBridge3;
//        int heightOfBridge4;
//        int heightOfBridge5;
//        int heightOfBridge6;
//        int heightOfBridge7;
//        int heightOfBridge8;


        int singleBridge;

        System.out.println("Enter height of bus");
        heightOfBus = scanner.nextInt();
        System.out.println("Enter number of bridges");
        numberofBridges = scanner.nextInt();

        int [] heightOfBridges = new int[numberofBridges];

        for (int i = 0; i < heightOfBridges.length; i++){
            System.out.println("Enter height of buses");
            singleBridge = heightOfBridges[i] = scanner.nextInt();

            if (singleBridge > heightOfBus){
                System.out.println("Will crash on bridge:" + singleBridge);
            }else {
                System.out.println("Will not crash:" + singleBridge);
            }
        }
    }
}