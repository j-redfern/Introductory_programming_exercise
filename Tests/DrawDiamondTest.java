import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class DrawDiamondTest {

    @Test
    void ValidateDataType(){
        DrawDiamond diamond = new DrawDiamond();

        boolean Validate = diamond.ValidateDataType("3");
        assertEquals(true, Validate);

        boolean InvalidValidate = diamond.ValidateDataType("input");
        assertEquals(false, InvalidValidate);

    }
    @Test
    void PrintIsoscelesTriangle(){
        DrawDiamond IsoscelesTriangle = new DrawDiamond();
        ArrayList<String> AsteriskLine = IsoscelesTriangle.PrintIsoscelesTriangle(3);
        assertEquals("  *", AsteriskLine.get(0));
        assertEquals(" ***", AsteriskLine.get(1));
        assertEquals("*****", AsteriskLine.get(2));
    }
}