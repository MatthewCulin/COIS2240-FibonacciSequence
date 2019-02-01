import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int userInput;

        System.out.print("Enter a value for n: ");
        userInput = scan.nextInt();

        long startTimeRec = System.nanoTime();
        fiboSeriesRec(userInput);
        long endTimeRec = System.nanoTime();
        long timeElapsedRec = endTimeRec - startTimeRec;
        System.out.println("Elapsed time in nanoseconds is: " + timeElapsedRec);

        long startTimeIte = System.nanoTime();
        fiboSeriesIte(userInput);
        long endTimeIte = System.nanoTime();
        long timeElapsedIte = endTimeIte - startTimeIte;
        System.out.println("Elapsed time in nanoseconds is: " + timeElapsedIte);
    }

    public static long fiboSeriesRec(int n)
    {
        if (n<2)
            return n;

        return (n-1)+(n-2);
    }

    public static long fiboSeriesIte(int n)
    {
        for(int i = n; i > 1; i--)
            return (n-1)+(n-2);

        return n;
    }
}
