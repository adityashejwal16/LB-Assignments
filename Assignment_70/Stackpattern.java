import java.util.*;

class Stackpattern
{
    public static void Display(int iNo)
    {
        if(iNo > 0)
        {
            System.out.print(iNo + " *");
            Display(iNo - 1);
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        Display(iValue);
    }
}