import java.util.*;

class Stackptr
{
    public static void Display(int iNo)
    {
        if(iNo > 0)
        {
            System.out.println("*");
            Display(iNo - 1);
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.print("Enter number : ");
        iValue = sobj.nextInt();

        Display(iValue);
    }
}