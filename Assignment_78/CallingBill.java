
import java.util.*;

class CallingBill
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter call duration in minutes: ");
        int minutes = sobj.nextInt();

        if(minutes < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        int charge = 0;

        if(minutes <= 5)
        {
            charge = 0;
        }
        else if(minutes <= 15)
        {
            charge = (minutes - 5) * 1;
        }
        else
        {
            charge = (10 * 1) + (minutes - 15) * 2;
        }

        System.out.println("Call Duration: " + minutes + " minutes");
        System.out.println("Total Call Charge: ₹" + charge);
    }
}