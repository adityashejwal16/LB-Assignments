class Logic
{
    void printDigit(int num)
    {
        while(num != 0)
    {
       int digit = num % 10;   // last digit
       System.out.println(digit);
       num = num / 10;         // remove last digit
    }

    }
}
class digitseparately
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printDigit(9876);
    }
}