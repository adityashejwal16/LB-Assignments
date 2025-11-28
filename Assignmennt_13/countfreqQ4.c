#include<stdio.h>

// Q. count frequency of 4
// Author : Aditya Shejwal
int CountFour(int iNo)
{
    int iDigit = 0;
    int iCnt = 0;

    // Handle negative numbers
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    // Extract digits one by one
    while(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit == 4)
        {
            iCnt++;
        }
        iNo = iNo / 10;
    }

    return iCnt;
}
int main()
{
    int iValue =0;
    int iRet = 0;

    printf("Enter number\n");
    scanf("%d",&iValue);

    iRet=CountFour(iValue);

    printf("%d",iRet);

    return 0;
}