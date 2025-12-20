class Logic
{
    void sumEvenNumbers(int n)
    {
        int sumEven = 0;

        for(int i =1; i<=n; i++)
        {
            if(n % 2 ==0 ) 
        {
            sumEven = sumEven + n;
            
        }
        System.out.println("Sum Of even = " + sumEven);
        }

    }
}
class sumofeven
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}