/* CSCI 
*/
import java.util.Random;

public class GCD {
    public static int recursiveGCD(int a, int b)
    {
        //starts timer to see how long method takes
        long startTime = System.nanoTime();

        //if statement is base case
        if (b == 0) {

            //when b == 0, the method is complete.
            //end the timer and find the total time elapsed.
            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;

            //print information
            System.out.println(a + ", Recursive Method, " + timeElapsed + " nanoseconds");
            return a;
        }
        //if b is not congruent to 0, the GCD has not been found.
        //replace a with b and b with a mod b until b == 0.
        else {
            return recursiveGCD(b, (a % b));
        }
    } //end recursiveGCD()

    public static int iterativeGCD(int a, int b)
    {
        //start timer
        long startTime = System.nanoTime();

        //while loop stops when a == b.
        //at that point a is the gcd
        while (a != b) {
            if (a > b){
                a = a - b;
            }
            else {
                b = b - a;
            }
        } //end while
        //end the timer
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;

        //print values
        System.out.println(a + ", Iterated Method, " + timeElapsed + " nanoseconds");
        return a;
    }//end iterativeGCD()

    public static void main (String args[]) {

        //assign random numbers between 1 and 1000 to x and y
        Random r = new Random();
        int x = r.nextInt((1000 - 100) + 1) + 100;
        int y = r.nextInt((1000-100) + 1) + 100;

        //output values of random numbers
        System.out.println("Finding GCD of " + x + ", " + y);

        //run methods with the same random numbers.
        //the more efficient method will have a smaller run time.
        iterativeGCD(x,y);
        recursiveGCD(x, y);

        //as you can see by running this program, the recursive method is far more efficient
        //than the iterated method for finding the GCD.

    }//end main()
}

