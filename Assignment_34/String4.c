#include<stdio.h>
#include<stdbool.h>

#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL ChkVowel(char *str)
{
     while(*str != '\0')
     {
        if(*str >= 'A' && *str <= 'Z')
        {
            return TRUE;
        }
        else 
        {
           return FALSE;
        }
        str++;
         
     }
}
int main()
{
    char arr[20];
    BOOL bRet = FALSE;

    printf("Enter String\n");
    scanf("%[^'\n]s",arr);

    bRet = ChkVowel(arr);

    if(bRet == TRUE)
    {
        printf("Contains Vowel\n");
    }
    else
    {
        printf("There is no vowel\n");
    }

    return 0;
}