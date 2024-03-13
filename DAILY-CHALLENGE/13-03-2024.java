import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s[]=sc.nextLine().split(" ");
		Arrays.sort(s);
		System.out.println(s[0]+"\n"+s[n-1]);
	}
}
