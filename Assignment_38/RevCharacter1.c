#include<stdio.h>

void StrCpyRev(char *src, char *dest)
{
    char *end = src;

    while(*end != '\0')
    {
        end++;
    }
    end--;   // move to last character (not '\0')

    while(end >= src)
    {
        *dest = *end;
        dest++;
        end--;
    }
    *dest = '\0';   // null terminate
}

int main()
{
    char arr[30] = "Marvellous Python";
    char brr[30];

    StrCpyRev(arr,brr);

    printf("%s\n", brr);

    return 0;
}
