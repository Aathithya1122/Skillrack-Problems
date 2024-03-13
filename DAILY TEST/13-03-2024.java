import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=Integer.parseInt(String.valueOf(s.charAt(0)));
		for(int i=0;i<n;i++){
		    for(int j=0;j<s.length();j++){
		        for(int k=0;k<n;k++){
		            System.out.print(s.charAt(j));
		        }
		    }
		    System.out.println();
		}
	}
}
