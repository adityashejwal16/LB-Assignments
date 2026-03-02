import java.util.*;

class Stackptr5
{
    public static void Display(int iNo)
    {
        if(iNo > 0)
        {
            Display(iNo - 1);
            char ch = (char)('a' + iNo - 1);
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