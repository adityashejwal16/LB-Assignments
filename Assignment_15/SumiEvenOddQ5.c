#include<stdio.h>


int CountDiff(int iNo)
{
    int iDigit = 0;
    int sumEven = 0;
    int sumOdd = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

      while(iNo != 0)
    {
        iDigit = iNo % 10;

        if(iDigit % 2 == 0)
        {
            sumEven = sumEven + iDigit;   // even digit
        }
        else
        {
            sumOdd = sumOdd + iDigit;     // odd digit
        }

        iNo = iNo / 10;
    }

    printf("Sum of even digit: %d\n", sumEven);
    printf("Sum of odd digit : %d\n", sumOdd);
}


int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number: ");
    scanf("%d",&iValue);

    iRet = CountDiff(iValue);

    printf("%d", iRet);

    return 0;
}
