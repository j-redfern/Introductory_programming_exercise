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
}