#include<stdio.h>
 
// between 3 and 7
int CountOdd(int iNo)
{   
    int iDigit = 0;
    int iCount = 0;

    if(iNo < 0)        
    {
        iNo = -iNo;
    }

    while(iNo != 0)
    {
        iDigit = iNo % 10; 

        if(iDigit >= 3 && iDigit <= 7)  // Check even 0,2,4,6,8
        {
            iCount++;
        }

        iNo = iNo / 10;   
    }

    return iCount;
}

int main()
{
    int iValue= 0;
    int iRet = 0;
    printf("Enter number");
    scanf("%d",&iValue);

    iRet = CountOdd(iValue);

   
    printf("%d",iRet);

    return 0;
}