#include<stdio.h>


int CountChar(char *str, char ch)
{
    int iCount = 0;
    while(*str != '\0')
    {
        if(*str == ch)
        {
           iCount++;
        }
        str++;
    } 
    
    return iCount; 
}

int main()
{
    char arr[20];
    char cValue = 0;
    int iRet = 0;

    printf("Enter String\n");
    scanf("%[^\n]s", arr);

    printf("Enter The Character\n");
    scanf(" %c", &cValue);  

    iRet = CountChar(arr, cValue);

        printf("Character Frequency is %d\n",iRet);

    return 0;
}