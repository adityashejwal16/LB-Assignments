import java.util.*;

class Matrix2
{
    public static int AddDiagonal(int Arr[][], int iRow, int iCol)
    {
        int sum = 0;

        for(int i = 0; i < iRow; i++)
        {
            if(i < iCol)
            {
                sum = sum + Arr[i][i];
            }
        }
        return sum;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int iRow = sobj.nextInt();

        System.out.print("Enter number of columns: ");
        int iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter matrix elements:");

       
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        // call
        System.out.println("Addition of Diagonal: " + AddDiagonal(Arr, iRow, iCol));
    }

    private static String Frequency(int[][] Arr, int iRow, int iCol, int iNo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}