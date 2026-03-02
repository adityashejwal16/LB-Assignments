import java.util.*;

class StringLeng
{
    public static int Strlen(String str)
    {
        if(str.length() == 0)
            return 0;

        return 1 + Strlen(str.substring(1));
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter string : ");
        String arr = sobj.next();

        int iRet = Strlen(arr);

        System.out.println("Length : " + iRet);
    }
}