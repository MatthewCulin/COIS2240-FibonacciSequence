/*
    Matthew Culin
    0597375
    COIS 2240H: Software Design & Modeling
    Assignment 1: Java Programming

    This code is used to compare the timings of a recursive function vs an iterative function. The functions will take
    a user generated input value (n) and determine the n values of the Fibonacci Sequence and print them to the output
    window along with the timings for each function
 */
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // Scanner will read user input
        Scanner scan = new Scanner(System.in);

        // Number of values in the Fibonacci Sequence to be determined
        int n;

        // Prompts the user to input a value for n and stores it
        System.out.print("Enter a value for n: ");
        n = scan.nextInt();

        // Arrays to store all values of the Fibonacci Sequence
        //int [] fibArrayRec = new int[n + 1];
        int [] fibArrayIte = new int[n + 1];

        // Timing of the recursive function
        long startTimeRec = System.nanoTime();
        fiboSeriesRec(n);
        long endTimeRec = System.nanoTime();

        //Determines the total runtime and outputs it
        long timeElapsedRec = endTimeRec - startTimeRec;
        System.out.println("Elapsed time in nanoseconds is: " + timeElapsedRec);

        // Timing of the iterative function
        long startTimeIte = System.nanoTime();
        fiboSeriesIte(n, fibArrayIte);
        long endTimeIte = System.nanoTime();

        //Determines the total runtime and outputs it
        long timeElapsedIte = endTimeIte - startTimeIte;
        System.out.println("\nElapsed time in nanoseconds is: " + timeElapsedIte);
    }// END OF MAIN

    // This is the recursive method which will call itself to determine the values of the Fibonacci Sequence
    public static int fiboSeriesRec(int n)
    {
        if (n == 0)
            return 0;

        else if (n == 1)
            return 1;

        return fiboSeriesRec(n-1)+fiboSeriesRec(n-2);
    }// END OF FIBOSERIESREC

    // This is the iterative function which will run a for loop internally to determine the values of the
    // Fibonacci Sequence
    public static int fiboSeriesIte(int n, int fibArrayIte[])
    {
        for(int i = 0; i <= n; i++)
        {
            // Will set the first 2 values of the array to 1 as the Fibonacci Sequence begins with 1, 1,...
            if (i == 0)
                fibArrayIte[i] = 0;

            else if (i == 1)
                fibArrayIte[i] = 1;

            else
                fibArrayIte[i] = fibArrayIte[i-2] + fibArrayIte[i-1];
        }

        return fibArrayIte[n];
    }// END OF FIBOSERIESITE
}//END OF MAIN CLASS
