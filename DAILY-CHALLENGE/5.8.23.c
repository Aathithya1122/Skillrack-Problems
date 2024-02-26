#include<stdio.h>
#include<stdlib.h>
int main()
{
int x,y,z;
scanf("%d %d %d",&x,&y,&z);
int a,b,c;
a=x;
b=y;
c=z;
a=(a/10)%10;
b=(b/10)%10;
c=(c/10)%10;
if(a==b && a>c){
    if(x>y)
        printf("%d",x);
    else
        printf("%d",y);
}
else if(a==c && a>b){
    if(x>z)
        printf("%d",x);
    else
        printf("%d",z);
}
else if(b==c && b>a){
    if(y>z)
        printf("%d",y);
    else
        printf("%d",z);
}
else if(a==b && a==c){
    if(x>y && x>z)
        printf("%d",x);
    else if(y>z && y>x)
        printf("%d",y);
    else
        printf("%d",z);
}
else if(a>b && a>c){
    printf("%d",x);
}
else if(b>a && b>c){
    printf("%d",y);
}
else{
    printf("%d",z);
}
return 0;
}
