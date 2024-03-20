import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		int i,j;
		for(i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		boolean f=false;
		for(i=0;i<n;i++){
		    for(j=i+1;j<n;j++){
		        if(arr[i]+arr[j]==k){
		            f=true;
		            break;
		        }
		    }
		}
		if(f){
		    System.out.println("yes");
		}else{
		    System.out.println("no");
		}
	}
}
