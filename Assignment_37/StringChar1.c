#include<stdio.h>
#include<stdbool.h>

#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL ChkChar(char *str, char ch)
{
    while(*str != '\0')
    {
        if(*str == ch)
        {
            return TRUE; 
        }
        str++;
    } 
    
    return FALSE;  // Character not found after checking entire string
}

int main()
{
    char arr[20];
    char cValue = 0;
    BOOL bRet = FALSE;

    printf("Enter String\n");
    scanf("%[^\n]s", arr);

    printf("Enter The Character\n");
    scanf(" %c", &cValue);  

    bRet = ChkChar(arr, cValue);

    if(bRet == TRUE)
    {
        printf("Character Found\n");
    }
    else
    {
        printf("Character Not Found\n");
    }

    return 0;
}