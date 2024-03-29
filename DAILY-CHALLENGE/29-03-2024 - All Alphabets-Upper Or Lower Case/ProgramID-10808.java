import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next().toLowerCase();
		String s2=sc.next().toLowerCase();
		Set<Character> set=new TreeSet<>();
		for(int i=0;i<s1.length();i++){
		    set.add(s1.charAt(i));
		}
		for(int i=0;i<s2.length();i++){
		    set.add(s2.charAt(i));
		}
		if(set.size()==26){
		    System.out.print("yes");
		}else{
		    System.out.print("no");
		}
	}
}
