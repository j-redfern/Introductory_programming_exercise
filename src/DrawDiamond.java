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
}
