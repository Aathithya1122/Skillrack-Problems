#include<stdio.h>
#include<stdlib.h>
int main()
{
    int n;
    scanf("%d",&n);
    int num=n%10;
    if(num==0){
        printf("%d",n);
        return 0;
    }
    int x=n,a,value1=0,value2=0;
    while(x!=0){
        a=x%10;
        x/=10;
        value1=value1*10+a;
    }
    while(value1!=0){
        a=value1%10;
        if(a==num){
            value2=value2*10 + 0;
        }else{
            value2=value2*10+a;
        }
        value1/=10;
    }
    printf("%d",value2);
    return 0;
}
