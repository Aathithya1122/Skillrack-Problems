#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
int main()
{
char ch[101],str[101];
scanf("%s",&ch);
int n=strlen(ch);
for(int i=0;i<n;i++){
    if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||
        ch[i]=='I'||ch[i]=='O'||ch[i]=='U'|| 
        isdigit(ch[i])){
            ch[i]='*';
    }
    
}
printf("%s",ch);
return 0;
}
