import java.util.*;

class ShoppingCal
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Budget: ");
        int budget = sobj.nextInt();

        System.out.print("Enter number of items: ");
        int N = sobj.nextInt();

        if(budget < 0 || N < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        int count = 0;

        for(int i = 1; i <= N; i++)
        {
            System.out.print("Enter price of item " + i + ": ");
            int price = sobj.nextInt();

            if(price <= 0)
            {
                System.out.println("Invalid price");
                return;
            }

            if(budget >= price)
            {
                budget = budget - price;
                count++;
            }
            else
            {
                break;
            }
        }

        System.out.println("Items Purchased: " + count);
        System.out.println("Remaining Balance: ₹" + budget);
    }
}