package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        int water = 200;
        int milk = 50;
        int coffeeBeans = 15;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int numberofCoffeeCups = scanner.nextInt();

        int totalAmountOfWater = water * numberofCoffeeCups;
        int totalAmountOfMilk = milk * numberofCoffeeCups;
        int totalAmountOfCoffeeBeans = coffeeBeans * numberofCoffeeCups;

        System.out.println("For" + " " + numberofCoffeeCups + " " + "cups of coffee you will need:");
        System.out.println(totalAmountOfWater + " " + "ml of water");
        System.out.println(totalAmountOfMilk + " " + "ml of milk");
        System.out.println(totalAmountOfCoffeeBeans + " " + "g of coffee beans");



    }
}
