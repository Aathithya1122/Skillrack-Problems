import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=2,y=1;
		while(n-->0){
		    System.out.print(x+" ");
		    y+=2;
		    x+=y;
		}
	}
}
