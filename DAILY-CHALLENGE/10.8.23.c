#include<stdio.h>
#include<stdlib.h>
int main()
{
int n;
scanf("%d",&n);
int m=n/2;
int i=1,j=n;
while(m--){
    for(int a=0;a<i;a++){
        printf("%d",i);
    }
    for(int a=0;a<n;a++){
        printf("%d",n);
    }
    i++;
    n--;
    printf("\n");
}
return 0;
}
