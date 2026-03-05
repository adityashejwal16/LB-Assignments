import java.util.*;

class HotelDisc
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of days stayed: ");
        int days = sobj.nextInt();

        if(days < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        int rate = 3000;
        double total = days * rate;

        if(days > 7)
        {
            total = total - (total * 0.05);
        }

        System.out.println("Total Stay Duration: " + days + " days");
        System.out.println("Final Bill Amount: ₹" + total);
    }
}