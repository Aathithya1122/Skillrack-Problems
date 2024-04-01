import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int k=sc.nextInt();
		int v=N,sum=0;
		while(k-->0){
		    String s=String.valueOf(v);
		    List<Integer> list=new ArrayList<>();
		    while(list.size()<N){
		        for(int i=0;i<s.length();i++){
		            int val=Integer.parseInt(String.valueOf(s.charAt(i)));
		            System.out.print(val);
		            sum+=val;
		            list.add(val);
		            if(list.size()==N){
		                break;
		            }
		        }
		    }
		    System.out.println();
		    v=sum;
		    sum=0;
		}
	}
}
