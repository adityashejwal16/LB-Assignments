import java.util.*;

class HospitalBill
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter days admitted: ");
        int days = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter ward type (Normal/ICU): ");
        String ward = sc.nextLine();

        System.out.print("Enter medicine bill: ");
        double medicine = sc.nextDouble();

        System.out.print("Enter consultation fee: ");
        double consult = sc.nextDouble();

        sc.nextLine();
        System.out.print("Insured (Yes/No): ");
        String insured = sc.nextLine();

        if(days < 0 || medicine < 0 || consult < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        double roomCharge = 0;

        if(ward.equalsIgnoreCase("Normal"))
            roomCharge = days * 2000;
        else if(ward.equalsIgnoreCase("ICU"))
            roomCharge = days * 5000;
        else
        {
            System.out.println("Invalid ward type");
            return;
        }

        double totalBill = roomCharge + medicine + consult;
        double insuranceCover = 0;

        if(insured.equalsIgnoreCase("Yes"))
        {
            double seventyPercent = totalBill * 0.70;
            insuranceCover = Math.min(50000, seventyPercent);
        }

        double finalPay = totalBill - insuranceCover;

        System.out.println("Total Bill: ₹" + totalBill);
        System.out.println("Insurance Cover: ₹" + insuranceCover);
        System.out.println("Final Payable Amount: ₹" + finalPay);
    }
}