import java.util.*;

class LibraryCal
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter total days book was kept: ");
        int daysKept = sobj.nextInt();

        if(daysKept < 0)
        {
            System.out.println("Invalid input");
        }
        else if(daysKept <= 7)
        {
            System.out.println("Returned on time. No fine applicable.");
        }
        else if(daysKept <= 12)
        {
            int fine = (daysKept - 7) * 5;
            System.out.println("Total fine to be paid: ₹" + fine);
        }
        else
        {
            int fine = (5 * 5) + ((daysKept - 12) * 10);
            System.out.println("Total fine to be paid: ₹" + fine);
        }
    }
}