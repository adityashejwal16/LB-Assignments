#include<stdio.h>

void PrintEven(int iNo)
{
    if(iNo <=0)
    {
        printf(" Enter a positive Number.\n");
        return;
    }
    
        int iCnt=0;
        for(iCnt =1; iCnt <=iNo; iCnt++)
        {
           printf("%d\t", 2 * iCnt); 
        }
        
    
    
}
int main()
{
    int iValue =0;
    printf("Enetr Number\n");
    scanf("%d",&iValue);

    PrintEven(iValue);

    return 0;
}