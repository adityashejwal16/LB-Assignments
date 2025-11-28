#include<stdio.h>

void RangeDisplay(int iStart, int iEnd)
{
    if(iStart > iEnd)
    {
        printf("invali range!\n");
        
    }
    printf("Even nymber between %d and %d are :\n", iStart , iEnd);
    for (int i = iStart; i <= iEnd; i++)
    {
        if(i%2==0)
        {
            printf("%d",i);
        }
    }
     printf("\n");

     
}

int main()
{
    int iValue1=0, iValue2=0;

    printf("Enter starting point\n");
    scanf("%d",&iValue1);

     printf("Enter ending point\n");
    scanf("%d",&iValue2);

    RangeDisplay(iValue1,iValue2);

    return 0;
}