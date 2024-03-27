import java.util.*;
public class Hello {
    public static boolean submatrix(int i,int j,int k,int n,int arr[][]){
        Set<Integer> set=new TreeSet<>();
        for(int x=i;x<i+k;x++){
            for(int y=j;y<j+k;y++){
                set.add(arr[x][y]);
            }
        }
        if(set.size()==1)   return true;
        return false;
    }
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
		i=0;
		boolean f=true;
		while(i<n){
		    j=0;
		    while(j<n){
		        if(!submatrix(i,j,k,n,arr)){
		            f=false;
				        break;
		        }
		        j+=k;
		    }
		    i+=k;
		}
		if(f){
		    System.out.print("yes");
		}else{
		    System.out.print("no");
		}
	}
}
