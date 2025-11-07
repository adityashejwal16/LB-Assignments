#include<stdio.h>

double SquareMeter(int iNo)
{
    double dSqMeter = 0.0;
    dSqMeter = iNo * 0.0929;  
    return dSqMeter;
}
int main()
{
    int iValue =0;
    double dRet=0.0;

    printf("Enter area in square feet\n");
    scanf("%d",&iValue);

    dRet=SquareMeter(iValue);

    printf("Area in square meters is: %.4lf\n", dRet);
    return 0;
}