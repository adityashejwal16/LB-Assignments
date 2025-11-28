#include<stdio.h>

// Q. count frequency of 2
// Author : Aditya Shejwal
int CountTwo(int iNo)
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
        if(iDigit == 2)
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
    int iRet =0;

    printf("Enter number\n");
    scanf("%d",&iValue);

    iRet =CountTwo(iValue);

    printf("%d",iRet);

    return 0;
}