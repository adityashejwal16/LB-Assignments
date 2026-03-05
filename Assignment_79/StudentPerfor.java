import java.util.*;

class StudentPerfor
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int N = sobj.nextInt();
        int M = sobj.nextInt();

        if(N <= 0 || M <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[N][M];

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] < 0 || arr[i][j] > 100)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        int total;
        int topper = 0;
        int maxTotal = 0;

        System.out.println("Student Totals:");

        for(int i = 0; i < N; i++)
        {
            total = 0;

            for(int j = 0; j < M; j++)
            {
                total = total + arr[i][j];
            }

            System.out.println("Student " + (i+1) + ": " + total);

            if(total > maxTotal)
            {
                maxTotal = total;
                topper = i + 1;
            }
        }

        System.out.println("Topper: Student " + topper);

        System.out.println("Subject Averages:");

        for(int j = 0; j < M; j++)
        {
            int sum = 0;

            for(int i = 0; i < N; i++)
            {
                sum = sum + arr[i][j];
            }

            double avg = (double)sum / N;

            System.out.printf("Subject %d: %.2f\n", j+1, avg);
        }

        System.out.println("Students Failed:");

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                if(arr[i][j] < 35)
                {
                    System.out.println("Student " + (i+1));
                    break;
                }
            }
        }
    }
}