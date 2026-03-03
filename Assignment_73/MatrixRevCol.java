import java.util.*;

class MatrixRevCol
{
    public static void ReverseCol(int Arr[][], int iRow, int iCol)
    {
        for(int i = iRow - 1; i >= 0; i--)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
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

        System.out.println("Matrix after reversing columns:");
        ReverseCol(Arr, row, col);
    }
}