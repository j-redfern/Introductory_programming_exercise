import java.util.ArrayList;

public class DrawTriangle {

    //method to validate data type
    public boolean ValidateDataType (String LineInput){
        try
        {
            Integer.parseInt(LineInput);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }

    //method to print * horizontally
    public String PrintTriangle (int numberOfAsterisks){

        String AsterisksCount = "";

        for(int i = 0 ; i < numberOfAsterisks ; i++){
            AsterisksCount += "*";
        }
        return AsterisksCount;
    }

    // method to print * vertically
    public ArrayList<String> PrintVerticalAsterisks( int numberOfAsterisks){

        ArrayList<String> AsteriskLine = new ArrayList<String>();

        for(int i = 0 ; i < numberOfAsterisks ; i++){
           AsteriskLine.add("*");
           System.out.println("*");
        }
        return AsteriskLine;
    }

    // method to print * as right triangle
    public ArrayList<String> PrintRightTriangle(int numberOfAsterisks){

        ArrayList<String> AsteriskLine = new ArrayList<String>();
        String AsterisksCount = "";

        for(int i = 0 ; i < numberOfAsterisks ; i++){
            AsterisksCount += "*";
            AsteriskLine.add(AsterisksCount);
            System.out.println(AsterisksCount);
        }
        return AsteriskLine;
    }
}