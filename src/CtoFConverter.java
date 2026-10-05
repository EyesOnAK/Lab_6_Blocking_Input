import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        String trash = "";
        boolean done = false;

        // Bulletproof input loop for Celsius
        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine(); // Clear the newline buffer
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You have to enter a valid number!\n");
            }
        } while (!done);

        // Convert to Fahrenheit
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        System.out.printf("Equivalent temperature in Fahrenheit: %.2f°F\n", fahrenheit);

        in.close();
    }
}