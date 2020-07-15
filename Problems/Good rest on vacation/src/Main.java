import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int durationOfDays;
        int costOfFoodPerDay;
        int returnFlight;
        int hotelCostPerNight;

       // System.out.println("Enter duration of days: ");
        durationOfDays = scanner.nextInt();
        //System.out.println("Enter cost of food per day: ");
        costOfFoodPerDay = scanner.nextInt();
        //System.out.println("Enter return flight amount: ");
        returnFlight = scanner.nextInt();
       // System.out.println("Enter cost of hotel per night");
        hotelCostPerNight = scanner.nextInt();

        int totalCostOfFood = costOfFoodPerDay * durationOfDays;
        int totalHotelCost = hotelCostPerNight * (durationOfDays - 1);

        int totalRequiredSum = totalCostOfFood + totalHotelCost + returnFlight * 2;

        System.out.println(totalRequiredSum);


    }
}