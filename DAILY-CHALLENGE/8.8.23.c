#include<stdio.h>
#include<stdlib.h>
int main()
{
int x,y;
scanf("%d %d",&x,&y);
if(x>y){
    for(int i=1;i<=10;i++){
        printf("%d ",i*x);
    }
}else{
    for(int i=1;i<=10;i++){
        printf("%d ",i*y);
    }
}
return 0;
}
