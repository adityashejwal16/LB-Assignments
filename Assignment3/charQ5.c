#include <stdio.h>

#define TRUE 1
#define FALSE 0
#define BOOL int

BOOL CheckVowel(char cValue)
{
    
    if (cValue == 'A' || cValue == 'E' || cValue == 'I' || cValue == 'O' || cValue == 'U' ||
        cValue == 'a' || cValue == 'e' || cValue == 'i' || cValue == 'o' || cValue == 'u')
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter character: \n");
    scanf(" %c", &cValue); 

    bRet = CheckVowel(cValue);

    if (bRet == TRUE)
    {
        printf("It is a Vowel\n");
    }
    else
    {
        printf("It is Not a Vowel\n");
    }

    return 0;
}
