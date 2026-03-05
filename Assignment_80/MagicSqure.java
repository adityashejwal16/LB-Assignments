import java.util.*;

class MagicSqure
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int N = sobj.nextInt();

        if(N <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[N][N];

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                arr[i][j] = sobj.nextInt();
            }
        }

        int sum = 0;

        for(int j = 0; j < N; j++)
        {
            sum = sum + arr[0][j];
        }

        boolean magic = true;

        for(int i = 0; i < N; i++)
        {
            int rowSum = 0;

            for(int j = 0; j < N; j++)
            {
                rowSum = rowSum + arr[i][j];
            }

            if(rowSum != sum)
            {
                magic = false;
            }
        }

        for(int j = 0; j < N; j++)
        {
            int colSum = 0;

            for(int i = 0; i < N; i++)
            {
                colSum = colSum + arr[i][j];
            }

            if(colSum != sum)
            {
                magic = false;
            }
        }

        int d1 = 0, d2 = 0;

        for(int i = 0; i < N; i++)
        {
            d1 = d1 + arr[i][i];
            d2 = d2 + arr[i][N-i-1];
        }

        if(d1 != sum || d2 != sum)
        {
            magic = false;
        }

        if(magic)
        {
            System.out.println("Matrix is a Magic Square");
        }
        else
        {
            System.out.println("Matrix is NOT a Magic Square");
        }
    }
}