// input : Hello
// output: 5

#include<stdio.h>

int Strlen(char *str) 
{ 
   int iCount = 0;

   while(*str != '\0')
   {
      iCount++;
      str++;   // pointer next 
   }
   return iCount;
} 

int main() 
{ 
   int iRet = 0;
   char arr[20]; 

   printf("Enter String : \n"); 
   scanf("%s",arr); 

   iRet = Strlen(arr); 

   printf("%d",iRet); 

   return 0;
}
