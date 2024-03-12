import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);;
		String s=sc.next();
		int p=s.length();
		int n=Integer.parseInt(s);
		double val=0;
		while(n>0){
		    double v=n%10;
		    v=Math.pow(v,p);;
		    val+=v;
		    n/=10;
		}
		System.out.println((int)val);
	}
}
