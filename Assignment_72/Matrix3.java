import java.util.*;

class Matrix3
{
    public static int MaxDiagonal(int Arr[][], int iRow, int iCol)
    {
        int max = Arr[0][0];

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i == j || i + j == iRow - 1)
                {
                    if(Arr[i][j] > max)
                    {
                        max = Arr[i][j];
                    }
                }
            }
        }
        return max;
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

        int result = MaxDiagonal(Arr, row, col);
        System.out.println("Maximum from diagonals is: " + result);
    }
}