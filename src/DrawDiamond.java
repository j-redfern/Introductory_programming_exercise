import java.util.ArrayList;

public class DrawDiamond {

    // method to validate data type
    public boolean ValidateDataType(String LineInput){
        try
        {
            Integer.parseInt(LineInput);
        }
        catch(NumberFormatException ex){
            return false;
        }
        return true;
        }

    // method to print isosceles triangle
    public ArrayList<String> PrintIsoscelesTriangle(int NumberOfAsteriskLine) {

        ArrayList<String> AsteriskLine = new ArrayList<String>();
        String AsterisksCount = "";
        int SpaceCount = NumberOfAsteriskLine;

        for (int i = 0; i < NumberOfAsteriskLine; i++) {

            String Spaces = "";

            // determine how many spaces needed before asterisks per line
            SpaceCount -= 1;

            // printing space before the asterisks per line
            for (int y = 0; y < SpaceCount; y++) {
                Spaces += " ";
                System.out.print(" ");
            }

            // printing spaces with asterisks (e.g [  *, **,*****])
            AsterisksCount += "*";
            AsteriskLine.add(Spaces + AsterisksCount);
            System.out.println(AsterisksCount);

            AsterisksCount += "*";

        }
        return AsteriskLine;
    }
}
