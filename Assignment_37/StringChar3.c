#include<stdio.h>


int FirstChar(char *str, char ch)
{
    int index = 0;
    while(*str != '\0')
    {
        if(*str == ch)
        {
           return index;   
        }
        str++;
        index++;
    } 
    
    return -1; 
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

    iRet = FirstChar(arr, cValue);

        printf("Character Location is : %d\n",iRet);

    return 0;
}