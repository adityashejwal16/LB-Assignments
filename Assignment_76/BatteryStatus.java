import java.util.*;

class BatteryStatus
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Battery Percentage: ");
        int battery = sobj.nextInt();

        if(battery < 0 || battery > 100)
        {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("Battery Percentage: " + battery + "%");

        if(battery <= 5)
        {
            System.out.println("Status: Critical");
        }
        else if(battery <= 15)
        {
            System.out.println("Status: Low");
        }
        else
        {
            System.out.println("Status: Normal");
        }
    }
}