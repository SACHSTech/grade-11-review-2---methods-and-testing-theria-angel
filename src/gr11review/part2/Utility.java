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
    
}
