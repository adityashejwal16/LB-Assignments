import java.util.*;

class WarehouseRobot
{
    static boolean CheckPath(int arr[][], int r, int c, int i, int j)
    {
        if(i >= r || j >= c || arr[i][j] == -1)
        {
            return false;
        }

        if(i == r-1 && j == c-1)
        {
            return true;
        }

        return CheckPath(arr,r,c,i+1,j) || CheckPath(arr,r,c,i,j+1);
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int R = sobj.nextInt();
        int C = sobj.nextInt();

        if(R <= 0 || C <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[R][C];

        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] != 0 && arr[i][j] != -1)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        boolean result = CheckPath(arr,R,C,0,0);

        if(result)
        {
            System.out.println("Path Available");
        }
        else
        {
            System.out.println("No Path Found");
        }
    }
}