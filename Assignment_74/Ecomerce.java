import java.util.*;

class EComerce
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        int amount = sobj.nextInt();

        sobj.nextLine();  // clear buffer

        System.out.print("Enter membership type (Premium/Regular): ");
        String member = sobj.nextLine();

        if(amount <= 0)
        {
            System.out.println("Invalid amount");
            return;
        }

        double discount = 0;

        if(amount > 5000)
            discount = amount * 0.20;
        else if(amount > 2000)
            discount = amount * 0.10;

        double discountedAmount = amount - discount;

        if(member.equalsIgnoreCase("Premium"))
        {
            discount += discountedAmount * 0.05;
        }
        else if(!member.equalsIgnoreCase("Regular"))
        {
            System.out.println("Invalid membership type");
            return;
        }

        double finalAmount = amount - discount;

        System.out.println("Original Amount: ₹" + amount);
        System.out.println("Total Discount: ₹" + discount);
        System.out.println("Final Payable Amount: ₹" + finalAmount);
    }
}