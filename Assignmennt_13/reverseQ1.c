#include<stdio.h>

void DisplayDigit(int iNo)
{
    int iDigit =0;
    // handle negative NO.
    if(iNo<0)
    {
        iNo=-iNo;
    }
    while(iNo!=0)
    {
        iDigit=iNo  % 10;
        printf("%d\n",iDigit);
        iNo = iNo / 10;
    }
}
int main()
{
    int iValue =0;

    printf("Enter number\n");
    scanf("%d",&iValue);

    DisplayDigit(iValue);
    
    return 0;
}
/*input 2395
  output 5
        9
        3
        2
*/