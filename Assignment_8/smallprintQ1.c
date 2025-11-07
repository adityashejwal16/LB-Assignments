#include<stdio.h>

void Number(int iNo)
{
    if (iNo < 50)
    {
        printf("Small number\n");
    }
    else if (iNo >= 50 && iNo <= 100)
    {
        printf("Medium number\n");
    }
    else
    {
        printf("Large number\n");
    }
}
int main()
{
    int iValue=0;

    printf("Enter a number:\n");
    scanf("%d",&iValue);

    Number(iValue);
    return 0;
}