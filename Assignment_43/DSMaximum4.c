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

int SecMaximum(PNODE Head)
{
    int Max1 = 0;
    int Max2 = 0;
    PNODE temp = Head;

    if (Head == NULL)
    {
        return -1;
    }

    while (temp != NULL)
    {
        if (temp->Data > Max1)
        {
            Max2 = Max1;
            Max1 = temp->Data;
        }
        else if ((temp->Data > Max2) && (temp->Data != Max1))
        {
            Max2 = temp->Data;
        }

        temp = temp->Next;
    }

    return Max2;
}


int main()
{
    PNODE First = NULL;
    int iRet = 0;

    InsertFirst(&First, 240); 
    InsertFirst(&First, 320);
    InsertFirst(&First, 230); 
    InsertFirst(&First, 110);

    iRet = SecMaximum(First);

    printf("Secound Maximum is: %d\n", iRet);

    return 0;
}
