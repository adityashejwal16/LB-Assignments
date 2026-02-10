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

void SumDigit(PNODE Head)
{
    int sum = 0;
    int no = 0;
    PNODE temp = Head;

    while (temp != NULL)
    {
        sum = 0;
        no = temp->Data;

        while (no != 0)
        {
            sum = sum + (no % 10);
            no = no / 10;
        }

        printf("%d\t", sum);

        temp = temp->Next;
    }
}


int main()
{
    PNODE First = NULL;
    int iRet = 0;

    InsertFirst(&First, 640); 
    InsertFirst(&First, 240); 
    InsertFirst(&First, 20);
    InsertFirst(&First, 230); 
    InsertFirst(&First, 110);

    SumDigit(First);

    return 0;
}
