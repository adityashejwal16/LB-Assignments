import java.util.*;

class RailwayTicket
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        int distance = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter class (Sleeper/3AC/2AC): ");
        String classType = sc.nextLine();

        System.out.print("Booking hours before journey: ");
        int hours = sc.nextInt();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        double baseFare = 0;

        if(distance <= 100)
            baseFare = distance * 1.5;
        else if(distance <= 500)
            baseFare = (100 * 1.5) + ((distance - 100) * 2);
        else
            baseFare = (100 * 1.5) + (400 * 2) + ((distance - 500) * 3);

        if(classType.equalsIgnoreCase("Sleeper"))
            baseFare += 100;
        else if(classType.equalsIgnoreCase("3AC"))
            baseFare += 300;
        else if(classType.equalsIgnoreCase("2AC"))
            baseFare += 500;
        else
        {
            System.out.println("Invalid class type");
            return;
        }

        if(hours <= 24)
        {
            baseFare += baseFare * 0.30;
        }

        if(age >= 60)
        {
            baseFare -= baseFare * 0.40;
        }

        System.out.println("Final Fare: ₹" + baseFare);
    }
}