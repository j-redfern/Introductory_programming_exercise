import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a number to print a triangle of requested size");

        Scanner input = new Scanner(System.in);
        input.hasNext();

        String line = input.nextLine();

        DrawTriangle triangle = new DrawTriangle();
        System.out.println(triangle.PrintTriangle(Integer.parseInt(line)));
        System.exit(0);
    }


}
