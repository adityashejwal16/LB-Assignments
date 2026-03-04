import java.util.*;

class RideFareCal
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        int km = sobj.nextInt();
        sobj.nextLine();

        System.out.print("Peak hour (Yes/No): ");
        String peak = sobj.nextLine();

        if(km < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        double fare = 50;  

        if(km <= 10)
        {
            fare = fare + (km * 12);
        }
        else
        {
            fare = fare + (10 * 12) + ((km - 10) * 15);
        }

        if(peak.equalsIgnoreCase("Yes"))
        {
            fare = fare + (fare * 0.20);
        }

        System.out.println("Distance: " + km + " km");
        System.out.println("Peak Hour: " + peak);
        System.out.println("Total Fare: ₹" + fare);
    }
}