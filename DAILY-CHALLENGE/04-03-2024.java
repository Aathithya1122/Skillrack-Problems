import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c1[]=sc.nextLine().toCharArray();
		String c2[]=sc.nextLine().split(" ");
		for(int i=0;i<c1.length;i++){
		    System.out.print(c2[(Integer.parseInt(String.valueOf(c1[i])))]);
		}
	}
}
