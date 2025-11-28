#include<stdio.h>
#include<stdbool.h>

bool is_divisible_by_five(int number)
{
    if(number % 5 == 0)
    {
        printf("The number is divisible by 5.\n");
        return true;
    }
    else
    {
        printf("The number is not divisible by 5.\n");
        return false;
    }
}

int main(void)
{
    int number = 0;
   
    printf("Enter number: ");
    scanf("%d", &number);

    printf("%d\n",is_divisible_by_five(number) ? "Yes" : "No");

    return 0;
}
