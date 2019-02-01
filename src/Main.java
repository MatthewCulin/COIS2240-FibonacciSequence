import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int userInput;

        System.out.print("Enter a value for n: ");
        userInput = scan.nextInt();

        fiboSeriesRec(userInput);
        fiboSeriesIte(userInput);
    }

    public static int fiboSeriesRec(int n)
    {
        if (n<2)
            return n;

        return (n-1)+(n-2);
    }

    public static int fiboSeriesIte(int n)
    {
        for(int i = n; i > 1; i--)
            return (n-1)+(n-2);

        return n;
    }
}
