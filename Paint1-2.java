import java.util.Scanner;
import java.util.InputMismatchException;

public class Paint1 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;

        final double squareFeetPerGallons = 350.0;

        boolean validInput;


        // HEIGHT INPUT LOOP
        do {

            validInput = true;

            try {

                System.out.println("Enter wall height (feet): ");

                wallHeight = scnr.nextDouble();

                if (wallHeight <= 0) {

                    System.out.println("Invalid input. Height must be greater than 0.");

                    validInput = false;

                }

            }

            catch (InputMismatchException e) {

                System.out.println("Invalid input. Enter a number.");

                scnr.nextLine();

                validInput = false;

            }

        } while (!validInput);



        // WIDTH INPUT LOOP
        do {

            validInput = true;

            try {

                System.out.println("Enter wall width (feet): ");

                wallWidth = scnr.nextDouble();

                if (wallWidth <= 0) {

                    System.out.println("Invalid input. Width must be greater than 0.");

                    validInput = false;

                }

            }

            catch (InputMismatchException e) {

                System.out.println("Invalid input. Enter a number.");

                scnr.nextLine();

                validInput = false;

            }

        } while (!validInput);



        // CALCULATIONS

        wallArea = wallHeight * wallWidth;

        System.out.println("Wall area: " + wallArea + " square feet");

        gallonsPaintNeeded = wallArea / squareFeetPerGallons;

        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

    }

}
