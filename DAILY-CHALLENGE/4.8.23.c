#include<stdio.h>
#include<stdlib.h>
int main()
{
char s[101];
scanf("%s",&s);
int n=strlen(s),i=0;
while(i<n){
    if(((s[i]!='A' && s[i]!='E' && s[i]!='I' && s[i]!='O' && s[i]!='U') && 
    (s[i+1]=='A' || s[i+1]=='E' || s[i+1]=='I' || s[i+1]=='O' || s[i+1]=='U'))||
    ((s[i]!='a' && s[i]!='e' && s[i]!='i' && s[i]!='o' && s[i]!='u') && 
    (s[i+1]=='a' || s[i+1]=='e' || s[i+1]=='i' || s[i+1]=='o' || s[i+1]=='u'))){
        printf("%c%c ",s[i],s[i+1]);
        i+=2;
    }else{
        i++;
    }
}
}
