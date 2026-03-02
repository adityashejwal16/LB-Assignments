import java.util.*;

class Stackptr3
{
    public static void Display(int iNo)
    {
        if(iNo > 0)
        {
            System.out.println(iNo);
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