import java.util.*;

class MatrixTranspose
{
    public static void Transpose(int Arr[][], int iRow, int iCol)
    {
        for(int j = 0; j < iCol; j++)
        {
            for(int i = 0; i < iRow; i++)
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

        System.out.println("Transpose of matrix:");
        Transpose(Arr, row, col);
    }
}