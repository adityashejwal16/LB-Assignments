import java.util.*;

class Stackptr4
{
    public static void Display(int iNo)
    {
        if(iNo > 0)
        {
            Display(iNo - 1);
            char ch = (char)('A' + iNo - 1);
            System.out.print(ch + " ");
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