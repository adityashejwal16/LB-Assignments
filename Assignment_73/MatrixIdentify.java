import java.util.*;

class MatrixIdentify
{
    public static boolean ChkIdentity(int Arr[][], int iRow, int iCol)
    {
        if(iRow != iCol)
        {
            return false;
        }

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i == j && Arr[i][j] != 1)
                {
                    return false;
                }
                if(i != j && Arr[i][j] != 0)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sobj.nextInt();

        int Arr[][] = new int[n][n];

        System.out.println("Enter matrix elements:");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        boolean result = ChkIdentity(Arr, n, n);

        if(result)
            System.out.println("Matrix is Identity Matrix");
        else
            System.out.println("Matrix is NOT Identity Matrix");
    }
}