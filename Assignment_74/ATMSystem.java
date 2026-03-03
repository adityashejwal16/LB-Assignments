import java.util.*;

class ATMSystem
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter current balance: ");
        int balance = sobj.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int withdrawAmount = sobj.nextInt();

        if(balance < 0 || withdrawAmount <= 0)
        {
            System.out.println("Transaction Failed: Invalid input");
        }
        else if(withdrawAmount % 100 != 0)
        {
            System.out.println("Transaction Failed: Amount must be multiple of 100");
        }
        else if(withdrawAmount > 25000)
        {
            System.out.println("Transaction Failed: Maximum limit is ₹25000");
        }
        else if(balance - withdrawAmount < 1000)
        {
            System.out.println("Transaction Failed: Minimum balance ₹1000 required");
        }
        else
        {
            balance = balance - withdrawAmount;
            System.out.println("Transaction Successful.");
            System.out.println("Remaining Balance: ₹" + balance);
        }
    }
}