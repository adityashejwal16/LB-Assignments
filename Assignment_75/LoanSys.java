import java.util.*;

class LoanSys
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sobj.nextInt();

        System.out.print("Enter Monthly Income: ");
        int income = sobj.nextInt();

        System.out.print("Enter Credit Score: ");
        int score = sobj.nextInt();

        sobj.nextLine();

        System.out.print("Existing Unpaid Loan (Yes/No): ");
        String loan = sobj.nextLine();

        if(age < 0 || income < 0 || score < 0)
        {
            System.out.println("Loan Rejected: Invalid input");
            return;
        }

        if(!(loan.equalsIgnoreCase("Yes") || loan.equalsIgnoreCase("No")))
        {
            System.out.println("Loan Rejected: Invalid loan status");
            return;
        }

        if(age < 21 || age > 60)
        {
            System.out.println("Loan Rejected: Age criteria not satisfied");
        }
        else if(income < 25000)
        {
            System.out.println("Loan Rejected: Income too low");
        }
        else if(score < 700)
        {
            System.out.println("Loan Rejected: Credit score too low");
        }
        else if(loan.equalsIgnoreCase("Yes"))
        {
            System.out.println("Loan Rejected: Existing unpaid loan");
        }
        else
        {
            System.out.println("Loan Approved");
        }
    }
}