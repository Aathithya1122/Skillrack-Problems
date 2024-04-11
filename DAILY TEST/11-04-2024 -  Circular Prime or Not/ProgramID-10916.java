import java.util.*;
public class Hello {
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isCircularPrime(String s){
        char ch[]=s.toCharArray();
        int c=ch.length,n=0;
        while(c-->0){
            n=Integer.parseInt(new String(ch));
            if(!isPrime(n)){
                return false;
            }
            char x=ch[ch.length-1];
            for(int i=ch.length-1;i>0;i--){
                ch[i]=ch[i-1];
            }
            ch[0]=x;
        }
        return true;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(isCircularPrime(s)){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
	}
}
