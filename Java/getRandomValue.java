/* get random value from array in java */
package tester;

import java.util.Random;

/**
 *
 * @author azzam
 */
public class getRandomValue {
    static int rnd;
    static int rr;
    
    public static void main(String args[]){
    
        getRandom(testArray);
    System.out.println("Random Value    : "+rr);
        
    }
    //basic array
    static int testArray[] = {71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,
        89,90,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,
    20,21,22,23,24,25,26,27,28,29,30,51,52,52,53,54,55,56,57,58,59,60}; 
     
    public static int getRandom(int[] testArray) { //get random values from basic array
    rnd = new Random().nextInt(testArray.length);
    rr = (testArray[rnd]);
    return testArray[rnd];
    }
}
 
