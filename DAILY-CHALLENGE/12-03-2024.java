import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String val="";
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)==' '){
		        System.out.print(val+" ");
		        val="";
		    }else{
		        val=s.charAt(i)+val;
		    }
		}
		System.out.print(val);
	}
}
