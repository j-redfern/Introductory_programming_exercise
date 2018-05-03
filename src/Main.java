import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Give user choice to choose diamond / triangle to draw
        System.out.println("Enter Diamond or Triangle to draw desired shape");

        Scanner input = new Scanner(System.in);
        input.hasNext();
        String line = input.nextLine().toLowerCase();

        // code for drawing triangle
        if (line.contains("triangle")) {

            System.out.println("Enter a number to print a triangle of requested size");

            input.hasNext();

            String line1 = input.nextLine();

            DrawTriangle triangle = new DrawTriangle();

            //Validate that line input is numeric
            boolean Validate = triangle.ValidateDataType(line1);

            if (Validate) {
                //triangle.PrintTriangle(Integer.parseInt(line));
                //triangle.PrintVerticalAsterisks(Integer.parseInt(line));
                triangle.PrintRightTriangle(Integer.parseInt(line1));
                System.exit(0);
            } else {
                System.out.println("Invalid input");
                System.exit(0);
            }
        }

        // code for drawing diamond
        if (line.contains("diamond")) {

            System.out.println("Enter a number to print a diamond of requested size");

            input.hasNext();

            String line1 = input.nextLine();

            DrawDiamond diamond = new DrawDiamond();

            //Validate that line input is numeric
            boolean Validate = diamond.ValidateDataType(line1);

            if (Validate) {
                diamond.PrintIsoscelesTriangle(Integer.parseInt(line1));
                System.exit(0);
            } else {
                System.out.println("Invalid input");
                System.exit(0);
            }
        }

        else {
                System.out.println("Invalid input");
                System.exit(0);
        }
    }
}
