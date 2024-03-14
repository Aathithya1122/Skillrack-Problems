import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		Set<Long> set=new TreeSet<>();
		while(n>0){
		    set.add(n%10);
		    n/=10;
		}
	    if(set.size()==3){
	        System.out.print("yes");
	    }else{
	        System.out.print("no");
	    }
	}
}
