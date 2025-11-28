#include<stdio.h>

void print_factors(int number)
{
    for(int i =1; i<=number; i++)
    {
        if(number % 2 ==0)
        {
            printf("%d",i);
        }
    }
    printf("%d",number);
}
int main()
{
    int number=0;

    printf("Enter number :");
    scanf("%d",&number);
    print_factors(number);

    return 0;
}