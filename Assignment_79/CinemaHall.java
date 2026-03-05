import java.util.*;

class CinemaHall
{
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

                if(arr[i][j] != 0 && arr[i][j] != 1)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        int totalBooked = 0;
        int maxRow = 0;
        int maxCount = 0;
        boolean fullRow = false;

        for(int i = 0; i < R; i++)
        {
            int rowCount = 0;

            for(int j = 0; j < C; j++)
            {
                if(arr[i][j] == 1)
                {
                    totalBooked++;
                    rowCount++;
                }
            }

            if(rowCount > maxCount)
            {
                maxCount = rowCount;
                maxRow = i + 1;
            }

            if(rowCount == C)
            {
                fullRow = true;
            }
        }

        System.out.println("Total Booked Seats: " + totalBooked);
        System.out.println("Row With Maximum Bookings: Row " + maxRow);

        if(fullRow)
        {
            System.out.println("Full Row Exists: Yes");
        }
        else
        {
            System.out.println("Full Row Exists: No");
        }
    }
}