#include<stdio.h>


int LastChar(char *str, char ch)
{
    int Last = 0;
    int index = 0;
    while(*str != '\0')
    {
        if(*str == ch)
        {
            Last = index;   
        }
        str++;
        Last ++; 
    } 
    
    return Last; 
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

    iRet = LastChar(arr, cValue);

        printf("Character Location is : %d\n",iRet);

    return 0;
}