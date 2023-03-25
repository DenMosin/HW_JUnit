import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StreamMainTest {

StreamMain streamMain;

    @BeforeEach
    public void beforeEach() {
        System.out.println();
        StreamMain streamMain = new StreamMain();
    }

    @AfterEach
    public void afterEach(){
        System.out.println();
        streamMain = null;
    }
    @Test
    public  void stream(){
        //arrange
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        //act
        StreamMain.stream(list);
        //assert
        assertNull(StreamMain.stream(list));


    }

    @Test
    public void filtr(){
        //arrange
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        //act
        StreamMain.filtr(list);
        //assert
        assertNotNull(StreamMain.filtr(list));

    }

    @Test
    public void summ(){
        //arrange
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        int expected = 62;
        //act
       StreamMain.summ(list);
        //assert
        assertEquals(expected, StreamMain.summ(list));
    }
}
