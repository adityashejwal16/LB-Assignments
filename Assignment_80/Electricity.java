import java.util.*;

class Electricity
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

        int arr[][] = new int[N][7];

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] < 0)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        int maxCity = 0;
        int maxUnits = 0;

        System.out.println("Weekly Consumption:");

        for(int i = 0; i < N; i++)
        {
            int total = 0;

            for(int j = 0; j < 7; j++)
            {
                total = total + arr[i][j];
            }

            System.out.println("City " + (i+1) + ": " + total);

            if(total > maxUnits)
            {
                maxUnits = total;
                maxCity = i + 1;
            }
        }

        System.out.println("Highest Consumption: City " + maxCity);

        int peakDay = 0;
        int maxDayUnits = 0;

        for(int j = 0; j < 7; j++)
        {
            int dayTotal = 0;

            for(int i = 0; i < N; i++)
            {
                dayTotal = dayTotal + arr[i][j];
            }

            if(dayTotal > maxDayUnits)
            {
                maxDayUnits = dayTotal;
                peakDay = j + 1;
            }
        }

        System.out.println("Peak Consumption Day : " + peakDay);

        System.out.println("Cities with consumption > 500:");

        for(int i = 0; i < N; i++)
        {
            int total = 0;

            for(int j = 0; j < 7; j++)
            {
                total = total + arr[i][j];
            }

            if(total > 500)
            {
                System.out.println("City " + (i+1));
            }
        }
    }
}