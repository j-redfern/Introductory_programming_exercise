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
    void PrintsNoOfAsteriskAsPerInputValue(){

        DrawTriangle triangle = new DrawTriangle();
        assertEquals("**", triangle.PrintTriangle(2));
        assertEquals("*****", triangle.PrintTriangle(5));
    }

    @Test
    void PrintsAsterisksVertically(){
        DrawTriangle triangle = new DrawTriangle();
        ArrayList<String> AsteriskLine = triangle.PrintVerticalAsterisks(2);
        assertEquals("*",AsteriskLine.get(0));
    }

}