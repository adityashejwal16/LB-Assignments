import java.util.*;

class SumOFdig
{
    public static int Sum(int iNo)
    {
        if(iNo == 0)
            return 0;

        return (iNo % 10) + Sum(iNo / 10);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        int iRet = Sum(iValue);

        System.out.println("Sum of digits : " + iRet);
    }
}