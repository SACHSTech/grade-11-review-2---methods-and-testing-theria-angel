package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;

public class UtilityTest{
  
    @Test
    public void xyzMiddleTest1(){
        assertEquals(true, Utility.xyzMiddle("AAxyzBB"));
    }

    @Test
    public void xyzMiddleTest2(){
        assertEquals(true, Utility.xyzMiddle("AxyzBB"));
    }

    @Test
    public void xyzMiddleTest3(){
        assertEquals(false, Utility.xyzMiddle("AxyzBBB"));
    }

    @Test
    public void xyzMiddleTest4(){
        assertEquals(false, Utility.xyzMiddle(""));
    }

    @Test
    public void xyzMiddleTest5(){
        assertEquals(true, Utility.xyzMiddle("xyz"));
    }

    @Test
    public void xyzMiddleTest6(){
        assertEquals(false, Utility.xyzMiddle("xy"));
    }

    @Test
    public void xyzMiddleTest7(){
        assertEquals(true, Utility.xyzMiddle("Axyz"));
    }

    @Test
    public void xyzMiddleTest8(){
        assertEquals(true, Utility.xyzMiddle("xyzA"));
    }

    @Test
    public void xyzMiddleTest9(){
        assertEquals(true, Utility.xyzMiddle("AxyzA"));
    }

    @Test
    public void xyzMiddleTest10(){
        assertEquals(false, Utility.xyzMiddle("xxxxxxyz"));
    }

    @Test
    public void alphaWordTest1() throws FileNotFoundException{
        assertEquals("adipiscing", Utility.alphaWord("/Users/angel/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-theria-angel-1/src/gr11review/part2/words.txt"));
    }

    @Test
    public void alphaWordTest2() throws FileNotFoundException {
        assertEquals("x", Utility.alphaWord("/Users/angel/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-theria-angel-1/src/gr11review/part2/words3.txt"));
    }

    @Test
    public void alphaWordTest3() throws FileNotFoundException {
        assertEquals("ab", Utility.alphaWord("/Users/angel/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-theria-angel-1/src/gr11review/part2/words4.txt"));
    }


}
