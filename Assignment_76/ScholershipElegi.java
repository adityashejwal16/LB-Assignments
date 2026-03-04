import java.util.*;

class ScholershipElegi
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Marks Percentage: ");
        int marks = sobj.nextInt();

        System.out.print("Enter Attendance Percentage: ");
        int attendance = sobj.nextInt();

        System.out.print("Enter Family Income: ");
        int income = sobj.nextInt();

        if(marks < 0 || marks > 100 || attendance < 0 || attendance > 100 || income < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(marks < 80)
        {
            System.out.println("Scholarship Rejected: Marks less than 80%");
        }
        else if(attendance < 75)
        {
            System.out.println("Scholarship Rejected: Attendance less than 75%");
        }
        else if(income > 300000)
        {
            System.out.println("Scholarship Rejected: Income exceeds limit");
        }
        else
        {
            System.out.println("Scholarship Approved");
        }
    }
}