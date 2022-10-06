package gr11review.part2;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 
 * Where each method is contained.
 * @author Angel Lin
 * 
 */

public class Utility {
    public static void main(String[] args) throws FileNotFoundException {

    }

    /**
     * xyzMiddle 
     * If the String contains "xyz" in the middle, return true. If not, return false.
     * 
     * @param str inputs a String
     * @return returns a boolean true or false
     * 
     */
    public static boolean xyzMiddle(String str) {
        String strxyz = "xyz";
        int intNum = str.length();
        int intMiddle = intNum / 2;
        //Make xyz a string for convenient checking, get the str length and get the middle of the string length

        if (intNum < 3)
        return false;
        //If the string is less than 3, automatically return false

        if (intNum % 2 != 0) {
            if (strxyz.equals(str.substring(intMiddle-1, intMiddle+2))) {
                return true;
                //If the string is not an even number and there is xyz in the middle, return true.
            } else {
                return false;
                //If not, return false
            }
        } else if (strxyz.equals(str.substring(intMiddle-1, intMiddle+2)) || strxyz.equals(str.substring(intMiddle-2, intMiddle+1))) {
            return true;
            //If the string is an even number, if xyz string is one slot before or after the middle point, return true.
        } else
            return false; 
            //If not, return false
    }
    
    /**
     * alphaWord
     * Inputs the file name of a file, read the file and output the word that is alphabetically first.
     * 
     * @param filenametxt inputs a String of a file name
     * @return returns a String
     * 
     */
    public static String alphaWord(String filenametxt) throws FileNotFoundException{
        File txt = new File (filenametxt);
        Scanner scan = new Scanner(txt);
        ArrayList<String> stringList = new ArrayList<String>();
        //Grab the file, use scanner to read the file, and make an ArrayList to add the words in the scanner to.
        
        while (scan.hasNextLine()){
            String strWords = scan.nextLine();
            stringList.add(strWords);
            //A while loop that keeps going if there is a next line in the file in order to input each of the words in an Arraylist.
        }

        stringList.replaceAll(String::toLowerCase);
        Collections.sort(stringList);
        //Make lowercase for strings just in case, and sort the Array list so the alphabetically first are at the first slot.
        
        scan.close();
        //Close scanner

        return stringList.get(0);
        //Return the first Arraylist slot.
    }

    /**
     * zeroFront
     * Inputs the array and rearanges so all the 0 are at the front of the sequence, output a new array with that new sequence.
     * 
     * @param nums input an array with integers in it
     * @return returns an array with rearranged numbers in it
     * 
     */
    public static int[] zeroFront(int[] nums) {
        Arrays.sort(nums);
        return nums;
        //Sort the numbers in the array and out put it which puts all the 0 at the front.
    }

    /**
     * seriesUp
     * By inputting an integer, the method will make an array with the patter {1, 1 , 2, 1, 2, 3...} for how many iterations the input requires.
     * 
     * @param n input an integer
     * @return returns an array
     * 
     */
    public static int[] seriesUp(int n) {

        int[] arr = new int[n * (n + 1) / 2];
        //Get the number of integers there will be in the array

        int num = 0;
        //Initialize

        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j){
                arr[num++] = j;
                //A double loop to go through each iteration and input it into the new array.
            }
        }

        return arr;
        //Return the array.
    }

    /**
     * split
     * Input a 2d array with the row and column number, get a new 2d array where the 2d array gets split by the column and row integer input.
     * 
     * @param arr input a 2d array
     * @param row input a row integer
     * @param col input a column integer
     * @return returns a 2d array with changes
     * 
     */
    public static int[][] split(int[][] arr, int row, int col) {

        int newArray[][] = new int[row + 1][col + 1];
        //Make the new 2d array with the dimentions given by the row and col inputs.

        for (int i = 0; i < row + 1; i++){
            for (int j = 0; j < col + 1; j++){
                newArray[i][j] = arr[i][j];
                //Put elements of the old array into the new array but only within the parameters of row and col.
            }
        }

        return newArray;
        //Return the new array.
    }

}
