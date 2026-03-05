import java.util.*;

class FitnessApp
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int goal = 10000;
        int count = 0;
        int max = 0;

        System.out.println("Enter steps for 7 days:");

        for(int i = 0; i < 7; i++)
        {
            int steps = sobj.nextInt();

            if(steps < 0)
            {
                System.out.println("Invalid steps");
                return;
            }

            if(steps >= goal)
            {
                count++;
            }

            if(steps > max)
            {
                max = steps;
            }
        }

        System.out.println("Goal Achieved Days: " + count);
        System.out.println("Maximum Steps in Week: " + max);
    }
}