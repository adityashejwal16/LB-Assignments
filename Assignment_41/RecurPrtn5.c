// input : 523
// output: 30

#include<stdio.h>

int Mult(int iNo) 
{ 
   int iAns = 1;
   int iDigit = 0;

   while(iNo != 0)
   {
       iDigit = iNo % 10;
       iAns = iAns * iDigit;
       iNo = iNo / 10;
   }
   return iAns;
} 

int main() 
{ 
   int iValue = 0, iRet = 0;

   printf("Enter Number : \n"); 
   scanf("%d",&iValue); 

   iRet = Mult(iValue); 

   printf("%d",iRet); 

   return 0;
}
