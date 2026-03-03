import java.util.*;

class MatrixSparse
{
    public static boolean ChkSparse(int Arr[][], int iRow, int iCol)
    {
        int zeroCount = 0;
        int total = iRow * iCol;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    zeroCount++;
                }
            }
        }

        if(zeroCount > total / 2)
            return true;
        else
            return false;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int row = sobj.nextInt();

        System.out.print("Enter columns: ");
        int col = sobj.nextInt();

        int Arr[][] = new int[row][col];

        System.out.println("Enter matrix elements:");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        boolean result = ChkSparse(Arr, row, col);

        if(result)
            System.out.println("Matrix is Sparse");
        else
            System.out.println("Matrix is NOT Sparse");
    }
}