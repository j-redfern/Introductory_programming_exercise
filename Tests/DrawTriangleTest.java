import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class DrawTriangleTest {

    @Test
    void PrintsSingularAsterisk(){

        DrawTriangle triangle = new DrawTriangle();
        assertEquals("*", triangle.PrintTriangle(1));
    }

    @Test
    void PrintsAsteriskHorizontally(){

        DrawTriangle triangle = new DrawTriangle();
        assertEquals("**", triangle.PrintTriangle(2));
        assertEquals("*****", triangle.PrintTriangle(5));
    }

    @Test
    void PrintsAsterisksVertically(){
        DrawTriangle triangle = new DrawTriangle();
        ArrayList<String> AsteriskLine = triangle.PrintVerticalAsterisks(2);
        assertEquals("*",AsteriskLine.get(0));
        assertEquals("*",AsteriskLine.get(1));
    }

    @Test
    void PrintsRightTriangle(){
        DrawTriangle triangle = new DrawTriangle();
        ArrayList<String> AsteriskLine = triangle.PrintRightTriangle(4);
        assertEquals("*",AsteriskLine.get(0));
        assertEquals("**",AsteriskLine.get(1));
        assertEquals("***",AsteriskLine.get(2));
        assertEquals("****",AsteriskLine.get(3));
    }

    @Test
    void ValidateOnlyAcceptNumericInput(){
        DrawTriangle triangle = new DrawTriangle();

        boolean Validate = triangle.ValidateDataType("3");
        assertEquals(true, Validate);

        boolean InvalidValidate = triangle.ValidateDataType("input");
        assertEquals(false, InvalidValidate);

    }
}