import java.util.*;
public class Hello {
    public static boolean digits(long n,int k){
        List<Long> list=new ArrayList<>();
        int j,i=0;
        while(n>0){
            list.add(n%10);
            n/=10;
        }
        int c=0;
        for(j=k;j>=0;j--){
            for(i=0;i<list.size();i++){
                if(list.get(i)==j){
                    c++;
                    break;
                }
            }
        }
        if(c==k+1)
            return true;
        return false;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int k=sc.nextInt();
		if(digits(n,k)){
		    System.out.println("yes");
		}else{
		    System.out.println("no");
		}
	}
}
