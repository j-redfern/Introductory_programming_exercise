import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a number to print a triangle of requested size");

        Scanner input = new Scanner(System.in);
        input.hasNext();

        String line = input.nextLine();

        DrawTriangle triangle = new DrawTriangle();

        //Validate that line input is numeric
        boolean Validate = triangle.ValidateDataType(line);

        if(Validate){
            //triangle.PrintTriangle(Integer.parseInt(line));
            //triangle.PrintVerticalAsterisks(Integer.parseInt(line));
            triangle.PrintRightTriangle(Integer.parseInt(line));
            System.exit(0);
        }
        else {
            System.out.println("Invalid input");
            System.exit(0);
        }
    }


}
