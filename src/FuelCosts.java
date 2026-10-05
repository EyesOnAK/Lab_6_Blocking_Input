import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        String trash = "";
        boolean done = false;

        // 1. Gallons of gas
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                if (gallons > 0) {
                    done = true;
                } else {
                    System.out.println("Gallons must be greater than 0.\n");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You have to enter a valid number!\n");
            }
        } while (!done);

        // 2. Fuel efficiency (mpg)
        done = false;
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                if (mpg > 0) {
                    done = true;
                } else {
                    System.out.println("Fuel efficiency must be greater than 0.\n");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You have to enter a valid number!\n");
            }
        } while (!done);

        // 3. Price per gallon
        done = false;
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                if (pricePerGallon > 0) {
                    done = true;
                } else {
                    System.out.println("Price per gallon must be greater than 0.\n");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You have to enter a valid number!\n");
            }
        } while (!done);

        // Calculations
        double costPer100Miles = (100.0 / mpg) * pricePerGallon;
        double totalDistance = gallons * mpg;

        System.out.printf("\nCost to drive 100 miles: $%.2f\n", costPer100Miles);
        System.out.printf("Total distance car can go on a full tank: %.2f miles\n", totalDistance);

        in.close();
    }
}