#include <stdio.h>

int FindLargest(int x, int y, int z)
{
    int largest;

    if (x >= y && x >= z)
        largest = x;
    else if (y >= x && y >= z)
        largest = y;
    else
        largest = z;

    return largest;
}

int main()
{
    int a, b, c, result;

    printf("Enter three numbers: ");
    scanf("%d %d %d", &a, &b, &c);

    result = FindLargest(a, b, c);
    printf("Largest number is: %d\n", result);

    return 0;
}
