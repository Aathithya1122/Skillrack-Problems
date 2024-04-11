import java.util.*;
public class Hello {
    public static int integer(int n,int m){
        if(m==0){
            return -1;
        }
        String s="";
        for(int i=1;i<m;i++){
            s+='1';
        }
        for(int i=0;i<n;i++){
            s+='0';
        }
        s+='1';
        int num=0,val=1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                num+=val;
            }
            val+=val;
        }
        return num;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.print(integer(n,m));
    }
}
