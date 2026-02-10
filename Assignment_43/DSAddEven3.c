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

int AdditionEven(PNODE Head)
{
    int Add = 0;
    PNODE temp = Head;

    while (temp != NULL)
    {
        if (temp->Data % 2 == 0)
        {
            Add = Add + temp->Data;
        }

        temp = temp->Next;   // move next node
    }

    return Add;
}



int main()
{
    PNODE First = NULL;
    int iRet = 0;

    InsertFirst(&First, 41); 
    InsertFirst(&First, 32);
    InsertFirst(&First, 20); 
    InsertFirst(&First, 11);

    iRet = AdditionEven(First);

    printf("Addition of even elements is: %d\n", iRet);

    return 0;
}
