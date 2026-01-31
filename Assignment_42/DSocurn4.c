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

int Maximum(PNODE Head)
{
    int iMax = 0;

    if(Head == NULL)   // safety check
    {
        return -1;
    }

    iMax = Head->Data;   // first node as maximum
    Head = Head->Next;

    while(Head != NULL)
    {
        if(Head->Data > iMax)
        {
            iMax = Head->Data;
        }
        Head = Head->Next;
    }
    return iMax;
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

    InsertFirst(&First, 240);
    InsertFirst(&First, 320); 
    InsertFirst(&First, 230); 
    InsertFirst(&First, 110);

    Display(First);

    iRet = Maximum(First); 
    printf("Maximum element is : %d\n", iRet);

    return 0;
}
