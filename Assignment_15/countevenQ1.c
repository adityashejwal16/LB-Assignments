#include<stdio.h>

int CountEven(int iNo)
{
    int iDigit = 0;
    int iCount = 0;

    // Handle negative numbers
     if (iNo < 0)
    {
        iNo = -iNo;
    }

    // Extract digits one by one
      while (iNo != 0)
     {
        iDigit = iNo % 10;
        if (iDigit % 2 == 0)   // check even digit
        {
            iCount++;
        }
        iNo = iNo / 10;
    }

    return iCount;
}

int main()
{
    int iValue =0;
    int iRet = 0;

    printf("Enter number\n");
    scanf("%d",&iValue);

    iRet=CountEven(iValue);

    printf("%d",iRet);
    return 0;
}
/* input 2395
   output 1
   input 1018
   output 2
*/