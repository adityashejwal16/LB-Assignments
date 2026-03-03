import java.util.*;

class UniversityReslt
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int total = 0;
        boolean fail = false;

        System.out.println("Enter marks of 5 subjects:");

        for(int i = 1; i <= 5; i++)
        {
            int marks = sobj.nextInt();

            if(marks < 0 || marks > 100)
            {
                System.out.println("Invalid marks entered");
                return;
            }

            if(marks < 35)
            {
                fail = true;
            }

            total = total + marks;
        }

        if(fail)
        {
            System.out.println("Result: Fail");
        }
        else
        {
            double avg = total / 5.0;
            System.out.println("Average Marks: " + avg);

            if(avg >= 75)
                System.out.println("Final Result: Distinction");
            else if(avg >= 60)
                System.out.println("Final Result: First Class");
            else if(avg >= 50)
                System.out.println("Final Result: Second Class");
            else
                System.out.println("Final Result: Pass");
        }
    }
}