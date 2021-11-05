package Game;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static Game.Funcs.*;

public class FuncsTests {
    @Test
    public void checkRed(){
        assertFalse(isGreenLight);
    }

    @Test
    public void successAllLoseRed(){
        int a=1, b=2, c=6;
        assertFalse(isGreenLight);
        assertEquals(countLost(a, b, c), 3);
    }

    @Test
    public void successAllWinRed(){
        int a=0, b=0, c=0;
        assertFalse(isGreenLight);
        assertEquals(countLost(a, b, c), 0);
    }


    @Test
    public void successNegativesRed(){
        int a=-1, b=-10, c=-3;
        assertFalse(isGreenLight);
        assertEquals(countLost(a, b, c), 0);
    }

    @Test
    public void successNoArgs(){
        assertEquals(countLost(), 0);
    }

    @Test
    public void successIntMax(){
        int a=1; int b=Integer.MAX_VALUE + 1;
        System.out.println(b);
        assertDoesNotThrow(()-> countLost(a, b));
    }
}
