import java.util.*;
public class Hello {
    public static void pattern(String s[]){
        for(int i=0;i<s.length;i++){
            System.out.print("+");
            for(int j=0;j<s[i].length();j++){
                System.out.print("-");
            }
        }
        System.out.println("+");
    }
    public static void patternString(String s[]){
        for(int i=0;i<s.length;i++){
            System.out.print("|"+s[i]);
        }
        System.out.println("|");
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s[]=sc.nextLine().split(" ");
		pattern(s);
		patternString(s);
		pattern(s);
	}
}
