#include<stdio.h>

void StrCpyToggel(char *src, char *dest)
{
    while(*src != '\0')
    {
        if(*src >= 'A' && *src <= 'Z')
        {
            *dest = *src + 32;   // convert to Small
        }
        else if(*src >= 'a' && *src <= 'z')
        {
             *dest = *src - 32;    // convert to Cap
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

    StrCpyToggel(arr,brr);

    printf("%s\n", brr);

    return 0;
}
