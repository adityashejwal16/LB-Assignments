import java.util.*;

class CinemaSeat
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        int rows = 5;
        int cols = 5;

        boolean seats[][] = new boolean[rows][cols];

        System.out.print("Enter number of seats to book: ");
        int n = sc.nextInt();

        int totalCost = 0;
        boolean fail = false;

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter row and column: ");
            int r = sc.nextInt();
            int c = sc.nextInt();

            if(r >= rows || c >= cols || seats[r][c])
            {
                fail = true;
            }
            else
            {
                seats[r][c] = true;
                totalCost += 200;
            }
        }

        if(fail)
        {
            System.out.println("Booking Failed");
        }
        else
        {
            if(n >= 6)
                totalCost -= totalCost * 0.10;

            System.out.println("Booking Successful");
            System.out.println("Total Cost: ₹" + totalCost);
        }
    }
}