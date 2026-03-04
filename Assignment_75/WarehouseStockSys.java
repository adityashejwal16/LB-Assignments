import java.util.*;

class WarehouseStockSys
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter current stock: ");
        int stock = sobj.nextInt();

        System.out.print("Enter requested quantity: ");
        int request = sobj.nextInt();

        if(stock < 0 || request <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(request > stock)
        {
            System.out.println("Order Failed: Insufficient Stock.");
        }
        else
        {
            stock = stock - request;

            System.out.println("Order Processed Successfully.");
            System.out.println("Remaining Stock: " + stock);

            if(stock < 5)
            {
                System.out.println("Low Stock Alert!");
            }
        }
    }
}