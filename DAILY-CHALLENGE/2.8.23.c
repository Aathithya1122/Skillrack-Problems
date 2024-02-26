#include<stdio.h>
#include<stdlib.h>
int main()
{
char ch1,ch2;
scanf("%c %c",&ch1,&ch2);
if(ch1<ch2){
    for(;ch1<=ch2;ch1++){
        if(ch1!='a' && ch1!='e' && ch1!='i' && ch1!='o' && ch1!='u'){
            printf("%c ",ch1);
        }
    }
}else{
    for(;ch1>=ch2;ch1--){
        if(ch1!='a' && ch1!='e' && ch1!='i' && ch1!='o' && ch1!='u'){
            printf("%c ",ch1);
        }
    }
}
return 0;
}
