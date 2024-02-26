#include<stdio.h>
#include<stdlib.h>
int main()
{
int n,m;
scanf("%d",&n);
scanf("%d",&m);
int arr[100001],index=0;
for(int i=n;i<=m;i++){
    for(int j=1;j*j<=i;j++){
        if(i%j==0){
            arr[index++]=j;
            arr[index++]=i/j;
        }
    }
}
for(int i=0;i<index;i++){
    for(int j=i+1;j<index;j++){
        if(arr[i]>arr[j]){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
int count;
for(int i=0;i<index;i++){
    count=0;
    for(int j=i+1;j<index;j++){
        if(i!=j && arr[i]==arr[j]){
            count++;
        }
    }
    if(count==0){
        printf("%d ",arr[i]);
    }
}
return 0;
}
