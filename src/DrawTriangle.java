public class DrawTriangle {

    public String PrintTriangle (int numberOfAsterisks){
        String AsterisksCount = "";

        for(int i = 0 ; i < numberOfAsterisks ; i++){
            AsterisksCount += '*';
        }
        return AsterisksCount;
    }

}