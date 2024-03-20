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
		int k=sc.nextInt();
		k--;
		for(i=0;i<n;i++){
		    int t=arr[i][k];
		    arr[i][k]=arr[k][i];
		    arr[k][i]=t;
		}
		for(i=0;i<n;i++){
		    for(j=0;j<n;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
