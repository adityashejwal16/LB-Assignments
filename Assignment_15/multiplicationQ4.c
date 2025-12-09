#include<stdio.h>

int MultiDigit(int iNo)
{
    int iDigit = 0;
    int iMult = 1;   // multiplication result

    if(iNo < 0)      // handle negative numbers
    {
        iNo = -iNo;
    }

    while(iNo != 0) 
    { 
        iDigit = iNo % 10;   // extract last digit
        iMult = iMult * iDigit;  // multiply
        iNo = iNo / 10;      // remove last digit
    } 

    return iMult;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number: ");
    scanf("%d",&iValue);

    iRet = MultiDigit(iValue);

    printf("Multiplication of digits is: %d", iRet);

    return 0;
}
