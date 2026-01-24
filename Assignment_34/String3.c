#include<stdio.h>

int Difference(char *str)
{
    int iSml = 0;
    int iCap = 0;
     
    
     while(*str != '\0')
     {
        if(*str >= 'a' && *str <= 'z')
        {
            iSml++;
        }
        else if(*str >= 'A' && *str <= 'Z')
        {
            iCap++;
        }
        str++;
         
     }
 
     return iSml - iCap;
}
int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter String\n");
    scanf("%[^'\n]s",arr);

    iRet = Difference(arr);

    printf("%d",iRet);

    return 0;
}