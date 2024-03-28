import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int k=m+n;
		List<Integer> list=new ArrayList<>();
		while(k>0){
		    list.add(k%2);
		    k/=2;
		}
		boolean f=true;
		int one=0;
		for(int i=list.size()-1;i>=0;i--){
		    if(list.get(i)==1){
		        one++;
		    }
		    if(one==2){
		        System.out.print(list.size()-i);
		        f=false;
		        break;
		    }
		}
		if(f){
		    System.out.print("0");
		}
	}
}
