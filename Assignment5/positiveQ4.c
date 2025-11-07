#include<stdio.h>

void CheckNumberType(int num)
{
    if (num > 0) //Positive
    {
        printf("%d is a Positive number.\n", num);
    }
    else if (num < 0) // Negative
    {
        printf("%d is a Negative number.\n", num);
    }
    else
    {
        printf("The number is Zero.\n");
    }
}
int main()
{
    int number;
    printf("Enter number: ");
    scanf("%d", &number);
    CheckNumberType(number);
    return 0;
}