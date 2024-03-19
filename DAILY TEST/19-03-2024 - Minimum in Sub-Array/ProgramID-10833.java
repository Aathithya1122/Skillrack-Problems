import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		while(m-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int min=Integer.MAX_VALUE;
		    for(int i=x-1;i<y;i++){
		        min=Math.min(min,arr[i]);
		    }
		    System.out.println(min);
		}
	}
}
