import java.util.*;

class MobilePlan
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter call minutes: ");
        int mins = sc.nextInt();

        System.out.print("Enter data usage (GB): ");
        int gb = sc.nextInt();

        System.out.print("Enter SMS count: ");
        int sms = sc.nextInt();

        // A
        double costA = 199;
        if(mins > 200) costA += (mins - 200) * 1;
        if(gb > 2) costA += (gb - 2) * 20;
        if(sms > 100) costA += (sms - 100) * 0.5;

        // B
        double costB = 399;
        if(mins > 500) costB += (mins - 500) * 0.8;
        if(gb > 5) costB += (gb - 5) * 15;
        if(sms > 300) costB += (sms - 300) * 0.3;

        // C
        double costC = 599;
        if(mins > 1000) costC += (mins - 1000) * 0.5;
        if(gb > 10) costC += (gb - 10) * 10;
        if(sms > 500) costC += (sms - 500) * 0.2;

        double minCost = Math.min(costA, Math.min(costB, costC));

        if(minCost == costA)
            System.out.println("Recommended Plan: A ₹" + costA);
        else if(minCost == costB)
            System.out.println("Recommended Plan: B ₹" + costB);
        else
            System.out.println("Recommended Plan: C ₹" + costC);
    }
}