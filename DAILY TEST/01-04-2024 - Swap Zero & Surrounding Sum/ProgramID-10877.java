import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		int i,j;
		for(i=0;i<n;i++){
		    for(j=0;j<n;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int val[][]=new int[n][n];
		List<Integer> list=new ArrayList<>();
		for(i=0;i<n;i++){
		    for(j=0;j<n;j++){
		        if(arr[i][j]==0){
		            int sum=0;
		            if(i>0){
		                sum+=arr[i-1][j];
		                val[i-1][j]=0;
		            }
		            if(j>0){
		                sum+=arr[i][j-1];
		                val[i][j-1]=0;
		            }
		            if(i<n-1){
		                sum+=arr[i+1][j];
		                val[i+1][j]=0;
		                list.add(i+1);
		                list.add(j);
		            }
		            if(j<n-1){
		                sum+=arr[i][j+1];
		                val[i][j+1]=0;
		                list.add(i);
		                list.add(j+1);
		            }
		            val[i][j]=sum;
		        }else{
		            val[i][j]=arr[i][j];
		        }
		    }
		}
		i=0;
		while(i<list.size()){
		    val[list.get(i++)][list.get(i++)]=0;
		}
		for(i=0;i<n;i++){
		    for(j=0;j<n;j++){
		        System.out.print(val[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
