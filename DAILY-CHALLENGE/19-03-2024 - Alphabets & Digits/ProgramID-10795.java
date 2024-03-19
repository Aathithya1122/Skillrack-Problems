import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="",s2="";
		for(int i=0;i<s.length();i++){
		    char c=s.charAt(i);
		    if(c>='0' && c<='9'){
		        s2+=c;
		    }else{
		        s1+=c;
		    }
		}
		System.out.println(s1+s2);
	}
}
