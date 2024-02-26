#include<stdio.h>
#include<stdlib.h>
int main()
{
int n;
scanf("%d",&n);
int arr[n];
for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
}
int v1,v2;
scanf("%d %d",&v1,&v2);
int value1,value2;
for(int i=0;i<n;i++){
    if(arr[i]%v1==0){
        value1=i;
        break;
    }
}
for(int i=n-1;i>=0;i--){
    if(arr[i]%v2==0){
        value2=i;
        break;
    }
}
int num1,num2;
num1=arr[value1];
num2=arr[value2];
arr[value1]=num2;
arr[value2]=num1;
for(int i=0;i<n;i++){
    printf("%d ",arr[i]);
}
return 0;
}
