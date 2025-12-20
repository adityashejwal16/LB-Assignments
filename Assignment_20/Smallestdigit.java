class Logic
{
    void findSmallestDigit(int num)
    {
        int small=10;
        for(int i =num; i!= 0; i = i / 10)
       {
          int digit = i % 10;
          if(digit < small)
        {
          small = digit;
        }
        System.out.println("Smallest digit is " +small);
       }
    }
}
class Smallestdigit
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}