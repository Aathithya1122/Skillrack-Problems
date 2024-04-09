void multiplesToBeginning(int arr[], int N)
{
    int i=0;
    while(i<N){
        if(arr[i]%10==0){
            int k=i;
            for(int j=i-1;j>=0;j--){
                if(arr[j]%10==0){
                    break;
                }
                int t=arr[k];
                arr[k]=arr[j];
                arr[j]=t;
                k--;
            }
        }
        i++;
    }
} // end of multiplesToBeginning function
