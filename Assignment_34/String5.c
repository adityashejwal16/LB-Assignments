#include<stdio.h>

void Reverse(char *str)
{
    char temp;
    int iStart = 0;
    int iEnd = 0;
    
    // Find the length of string
    while(str[iEnd] != '\0')
    {
        iEnd++;
    }
    iEnd--;  // Point to last character
    
    // Swap characters from both ends
    while(iStart < iEnd)
    {
        temp = str[iStart];
        str[iStart] = str[iEnd];
        str[iEnd] = temp;
        
        iStart++;
        iEnd--;
    }
}

int main()
{
    char arr[20];

    printf("Enter String\n");
    scanf("%[^\n]s", arr);

    Reverse(arr);

    printf("%s\n", arr);

    return 0;
}
