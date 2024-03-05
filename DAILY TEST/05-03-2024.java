import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		int i,j;;
		for(i=0;i<n;i++){
		    for(j=0;j<n;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int k=sc.nextInt(),N=n*2 + 1,x=0,y=0;
		for(i=0;i<N;i++){
		    y=0;
		    boolean f=false;
		    for(j=0;j<N;j++){
		        if(i%2==0 || j%2==0){
		            System.out.print(k+" ");
		        }else{
		            System.out.print(arr[x][y]+" ");
		            y++;
		            f=true;
		        }
		    }
		    if(f){
		        x++;
		    }
		    System.out.println();
		}
	}
}
