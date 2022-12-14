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

    @Test
    public void zeroFrontTest1() {
        int[] intTest1Array = {1, 0, 0, 1};
        int[] intResult1Array = {0, 0, 1, 1};
        assertTrue(Arrays.equals(Utility.zeroFront(intTest1Array), intResult1Array));
    }

    @Test
    public void zeroFrontTest2(){
        int[] intTest2Array = {1, 1, 0, 1, 1, 1, 0};
        int[] intResult2Array = {0, 0, 1, 1, 1, 1, 1};
        assertTrue(Arrays.equals(Utility.zeroFront(intTest2Array), intResult2Array));
    }

    @Test
    public void zeroFrontTest3(){
        int[] intTest3Array = {1, 1, 1};
        assertTrue(Arrays.equals(Utility.zeroFront(intTest3Array), intTest3Array));
    }

    @Test
    public void zeroFrontTest4(){
        int[] intTest4Array = {};
        assertTrue(Arrays.equals(Utility.zeroFront(intTest4Array), intTest4Array));
    }

    @Test
    public void seriesUpTest1(){
        int[] intResult5Array = {1, 1, 2, 1, 2, 3};
        assertTrue(Arrays.equals(Utility.seriesUp(3), intResult5Array));
    }

    @Test
    public void seriesUpTest2(){
        int[] intResult6Array = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4};
        assertTrue(Arrays.equals(Utility.seriesUp(4), intResult6Array));
    }

    @Test
    public void seriesUpTest3(){
        int[] intResult7Array = {1, 1, 2};
        assertTrue(Arrays.equals(Utility.seriesUp(2), intResult7Array));
    }

    @Test
    public void seriesUpTest4(){
        int[] intResult8Array = {};
        assertTrue(Arrays.equals(Utility.seriesUp(0), intResult8Array));
    }

    @Test
    public void splitTest1(){
        int[][] intTest12dArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] intResult12dArray = {{1, 2}, {4, 5}};
        int[][] intNew12dArray = Utility.split(intTest12dArray, 1, 1);
        assertTrue(Arrays.deepEquals(intNew12dArray, intResult12dArray));
    }

    @Test
    public void splitTest2(){
        int[][] intTest22dArray = {{1, 2, 3}, {4, 5, 6}};
        int[][] intResult22dArray = {{1, 2}};
        int[][] intNew22dArray = Utility.split(intTest22dArray, 0, 1);
        assertTrue(Arrays.deepEquals(intResult22dArray, intNew22dArray));
    }

    @Test
    public void splitTest3(){
        int[][] intTest32dArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] intNew32dArray = Utility.split(intTest32dArray, 2, 2);
        assertTrue(Arrays.deepEquals(intNew32dArray, intTest32dArray));
    }

}
