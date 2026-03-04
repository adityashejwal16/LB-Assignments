import java.util.*;

class TrafficFine
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        sobj.nextLine();

        System.out.print("Helmet worn (Yes/No): ");
        String helmet = sobj.nextLine();

        System.out.print("License available (Yes/No): ");
        String license = sobj.nextLine();

        System.out.print("Overspeeding (Yes/No): ");
        String speed = sobj.nextLine();

        int fine = 0;

        if(!(helmet.equalsIgnoreCase("Yes") || helmet.equalsIgnoreCase("No")) ||
           !(license.equalsIgnoreCase("Yes") || license.equalsIgnoreCase("No")) ||
           !(speed.equalsIgnoreCase("Yes") || speed.equalsIgnoreCase("No")))
        {
            System.out.println("Invalid input");
            return;
        }

        if(helmet.equalsIgnoreCase("No"))
        {
            fine += 500;
        }

        if(license.equalsIgnoreCase("No"))
        {
            fine += 1000;
        }

        if(speed.equalsIgnoreCase("Yes"))
        {
            fine += 1500;
        }

        System.out.println("Total Fine Amount: ₹" + fine);
    }
}