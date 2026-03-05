
import java.util.*;

class OnlineElec
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of votes: ");
        int N = sobj.nextInt();

        if(N < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        HashSet<Integer> voters = new HashSet<>();
        int duplicate = 0;

        for(int i = 0; i < N; i++)
        {
            int id = sobj.nextInt();

            if(id < 0)
            {
                System.out.println("Invalid ID");
                return;
            }

            if(voters.contains(id))
            {
                duplicate++;
            }
            else
            {
                voters.add(id);
            }
        }

        System.out.println("Valid Votes: " + voters.size());
        System.out.println("Rejected Duplicate Votes: " + duplicate);
    }
}