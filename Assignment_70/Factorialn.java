import java.util.*;

class Factorialn
{
    public static int Fact(int iNo)
    {
        if(iNo == 1)
            return 1;

        return iNo * Fact(iNo - 1);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        int iRet = Fact(iValue);

        System.out.println("Factorial : " + iRet);
    }
}