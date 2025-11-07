// Header File
#include<stdio.h>

// Q. frequency of such digit less than 6
// Author : Aditya Shejwal
int Count(int iNo)
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
        if(iDigit == 6)
        {
            iCnt++;
        }
        iNo = iNo / 10;
    }

    return iCnt;
}
int main()
{
    int iValue=0;
    int iRet=0;

    printf("Enter Number\n");
    scanf("%d",&iValue);

    iRet=Count(iValue);

    printf("%d",iRet);
    return 0;
}
