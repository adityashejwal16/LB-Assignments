#include<stdio.h>

void StrRevX(char *str)
{
    char *start = str;
    char *end = str;
    char temp;
    
    // Move end pointer to last character
    while(*end != '\0')
    {
        end++;
    }
    end--;  // Move back from '\0' to last character
    
    // Swap characters from both ends moving towards center
    while(start < end)
    {
        // Swap
        temp = *start;
        *start = *end;
        *end = temp;
        
        // Move pointers
        start++;
        end--;
    }
}

int main()
{
    char arr[20];

    printf("Enter String\n");
    scanf("%[^\n]s", arr);

    printf("Original String: %s\n", arr);

    StrRevX(arr);

    printf("Reversed String: %s\n", arr);

    return 0;
}