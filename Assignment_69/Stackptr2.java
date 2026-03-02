import java.util.*;

class Stackptr2
{
    public static void Display(int iNo)
    {
        if(iNo > 0)
        {
            Display(iNo - 1);
            System.out.println(iNo);
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