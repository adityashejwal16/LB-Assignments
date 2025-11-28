#include<stdio.h>

int RangeSum(int iStart, int iEnd)
{
    int i = 0;
    int iSum = 0;


    if (iStart > iEnd)
    {
        printf("Invalid range.\n");
        return 0;
    }

    printf("Numbers between %d are:\n", iStart, iEnd);

    for (i = iStart; i <= iEnd; i++)
    {
        printf("%d ", i);
        iSum = iSum + i;
    }

    return iSum;

}

int main()
{
    int iValue1=0, iValue2=0, iRet=0;

    printf("Enter starting point\n");
    scanf("%d",&iValue1);

     printf("Enter ending point\n");
    scanf("%d",&iValue2);

    iRet=RangeSum(iValue1,iValue2);
    printf("Addition is %d",iRet);
    return 0;
}