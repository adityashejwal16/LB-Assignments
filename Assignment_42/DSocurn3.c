#include<stdio.h>
#include<stdlib.h>

#pragma pack(1)
struct node
{
    int Data;
    struct node *Next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

void InsertFirst(PPNODE First, int no)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->Data = no;
    newn->Next = NULL;

    if(*First == NULL)
    {
        *First = newn;
    }
    else
    {
        newn->Next = *First;
        *First = newn;
    }
}

int Addition(PNODE Head)
{
    int iSum = 0;

    while(Head != NULL)
    {
        iSum = iSum + Head -> Data;
        Head = Head -> Next;
    }
    return iSum;
}

void Display(PNODE first)
{
   while(first != NULL)
   {
      printf("| %d |-> ", first->Data);
      first = first->Next;
   }
   printf("NULL\n");
}

int main()
{
    PNODE First = NULL;
    int iRet = 0;

    InsertFirst(&First, 40);
    InsertFirst(&First, 30); 
    InsertFirst(&First, 20); 
    InsertFirst(&First, 10);

    Display(First);

    iRet = Addition(First);
    printf("Addition of all elements is : %d\n", iRet);


    return 0;
}
