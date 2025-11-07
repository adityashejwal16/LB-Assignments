#include<stdio.h>
#include <math.h>  

double CircleArea(float fRadius)
{
    double dArea = M_PI * fRadius * fRadius;
    return dArea;
}
int main()
{
    float fValue = 0.0;
    double dRet = 0.0;

    printf("Enter radius");
    scanf("%f",&fValue);

    dRet=CircleArea(fValue);

    printf("Area of circle is: %.2lf\n", dRet);

    return 0;
}