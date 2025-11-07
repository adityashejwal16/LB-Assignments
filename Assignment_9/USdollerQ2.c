#include<stdio.h>

int DollerToINR(int iNo)
{
   int iRate = 70;   // i Assume 1 USD = 70 INR (uh can change this rate)
    int iINR = 0;

    iINR = iNo * iRate;

    return iINR;
}
int main()
{
    int iValue=0, iRet=0;

    printf("Enetr number of USD\n");
    scanf("%d", &iValue);

    iRet=DollerToINR(iValue);

    printf("Value in INR is %d", iRet);
    return 0;
}