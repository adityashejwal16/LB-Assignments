#include<stdio.h>

void StrCpyCap(char *src, char *dest)
{
    while(*src != '\0')
    {
        if(*src >= 'A' && *src <= 'Z')
        {
            *dest = *src + 32;   // convert to Small
        }
        else
        {
            *dest = *src;        // copy as it is
        }

        src++;
        dest++;
    }
    *dest = '\0';  // end of string
}

int main()
{
    char arr[30] = "Marvellous Python 2";
    char brr[30];

    StrCpyCap(arr,brr);

    printf("%s\n", brr);

    return 0;
}
