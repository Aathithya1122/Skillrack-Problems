import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int holeCount=0;
		while(n>0){
		    int i=n%10;
		    if(i==0 || i==4 || i==6 || i==9){
		        holeCount+=1;
		    }else if(i==8){
		        holeCount+=2;
		    }
		    n/=10;
		}
		System.out.println(holeCount);
	}
}
