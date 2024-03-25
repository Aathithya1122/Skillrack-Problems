import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int sum=0;
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)>='0' && s.charAt(i)<='9'){
		        sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
		    }
		}
		System.out.println(sum);
	}
}
