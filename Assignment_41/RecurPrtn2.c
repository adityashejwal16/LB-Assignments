// input : 879
// output: 24
#include<stdio.h>

int Sum(int iNo) 
{ 
   int iAns = 0;
   int iDigit = 0;

   while(iNo != 0)
   {
      iDigit = iNo % 10;
      iAns = iAns + iDigit;
      iNo = iNo / 10;
   }
   return iAns;
} 
int main() 
{ 
   int iValue = 0, iRet = 0; 

   printf("Enter number"); 
   scanf("%d",&iValue); 

   iRet = Sum(iValue); 

   printf("%d",iRet); 

   return 0;
}