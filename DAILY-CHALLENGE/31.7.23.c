#include<stdio.h>
#include<stdlib.h>

int main()
{
int a,b,x,y,z;
scanf("%d %d",&a,&b);
scanf("%d %d %d",&x,&y,&z);
for(int i=a;i<=b;i++){
    if(i%x==0 || i%y==0 || i%z==0){
        printf("%d ",i);
    }
}
}
