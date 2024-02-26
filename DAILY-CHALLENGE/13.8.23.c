#include<stdio.h>
#include<stdlib.h>
int main()
{
    char c;
    scanf("%c",&c);
    char ch='A',ch1;
    c=toupper(c);
    while(ch<=c){
        ch1='A';
        while(ch1<=ch){
            printf("%c ",ch);
            ch1++;
        }
        printf("\n");
        ch++;
    }
    return 0;
}
