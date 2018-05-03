import java.util.ArrayList;

public class DrawTriangle {

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


}