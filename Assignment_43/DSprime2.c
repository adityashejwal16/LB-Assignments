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

void DisplayPrime(PNODE Head)
{
    int i = 0, num = 0;
    PNODE temp = Head;

    while (temp != NULL)
    {
        if (temp->Data <= 1)
        {
            temp = temp->Next;
            continue;
        }

        num = 1;   //  prime

        for (i = 2; i <= temp->Data / 2; i++)
        {
            if (temp->Data % i == 0)
            {
                num = 0;   // not prime
                break;
            }
        }

        if (num == 1)
        {
            printf("prime number is : %d\n", temp->Data);
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

    DisplayPrime(First);

    return 0;
}
