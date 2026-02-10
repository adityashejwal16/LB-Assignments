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


void DisplayPerfect(PNODE Head)
{
    int i = 0, sum = 0;
    PNODE temp = Head;

    while(temp != NULL)
    {
        sum = 0;

        for(i = 1; i <= temp->Data / 2; i++)
        {
            if(temp->Data % i == 0)
            {
                sum = sum + i;
            }
        }

        if(sum == temp->Data)
        {
            printf("%d ", temp->Data);
        }

        temp = temp->Next;
    }
}


int main()
{
    PNODE First = NULL;
    int iRet = 0;

    InsertFirst(&First, 89);
    InsertFirst(&First, 6); 
    InsertFirst(&First, 41); 
    InsertFirst(&First, 17);
    InsertFirst(&First, 28); 
    InsertFirst(&First, 11);

    DisplayPerfect(First);

    return 0;
}
