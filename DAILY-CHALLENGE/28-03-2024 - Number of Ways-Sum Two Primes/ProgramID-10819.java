import java.util.*;
public class Hello {
    public static boolean isPrime(int i){
        int j=i;
        j--;
        while(j>1){
            if(i%j==0){
                return false;
            }
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		for(int i=2;i<=n/2;i++){
		    if(isPrime(i) && isPrime(n-i)){
		        c++;
		    }
		}
		System.out.print(c);
	}
}
