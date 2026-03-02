import java.util.*;

class ProductDig
{
    public static int Mult(int iNo)
    {
        if(iNo == 0)
            return 1;

        return (iNo % 10) * Mult(iNo / 10);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        int iRet = Mult(iValue);

        System.out.println("Product of digits : " + iRet);
    }
}