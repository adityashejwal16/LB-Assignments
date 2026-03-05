import java.util.*;

class WaterBill
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        System.out.print("Weeks late: ");
        int weeks = sc.nextInt();

        if(units < 0 || weeks < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        double bill = 100; 

        if(units <= 50)
            bill += units * 5;
        else if(units <= 100)
            bill += (50 * 5) + ((units - 50) * 8);
        else
            bill += (50 * 5) + (50 * 8) + ((units - 100) * 10);

        double penalty = weeks * 0.02;
        if(penalty > 0.10) penalty = 0.10;

        bill += bill * penalty;

        System.out.println("Total Water Bill: ₹" + bill);
    }
}