import java.util.*;

class Matrix4
{
    public static void AddColumn(int Arr[][], int iRow, int iCol)
    {
        for(int j = 0; j < iCol; j++)
        {
            int sum = 0;

            for(int i = 0; i < iRow; i++)
            {
                sum = sum + Arr[i][j];
            }

            System.out.print(sum + " ");
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

        System.out.println("Column addition:");
        AddColumn(Arr, row, col);
    }
}