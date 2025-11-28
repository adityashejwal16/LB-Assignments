#include<stdio.h>

void DisplayEven(int iStart , int iEnd)
{
    
     for (int i = iStart; i <= iEnd; i++)
    {
        printf("%d ", i);
    }
     printf("Numbers between %d and %d are:\n", iStart, iEnd);
}

int main()
{
    int iValue1=0 , iValue2=0;

    printf("Enter starting point");
    scanf("%d",&iValue1);

    printf("Enter ending point");
    scanf("%d",iValue2);

    RangeDisplayEven(iValue1,iValue2);

    return 0;
}