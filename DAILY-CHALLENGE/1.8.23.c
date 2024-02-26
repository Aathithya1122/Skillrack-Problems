#include<stdio.h>
int main(){
    int num,lastdigit;
    scanf("%d",&num);
    lastdigit=num%10;
    while(num>=10){
        num=num/10;
    }
    printf("%d%d",num,lastdigit);
    return 0;
}
