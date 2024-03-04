import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c[]=sc.next().toCharArray();
		Arrays.sort(c);
		for(int i=0;i<c.length;i++){
		    if(c[i]!='0'){
		        char t=c[0];
		        c[0]=c[i];
		        c[i]=t;
		        break;
		    }
		}
		for(int i=0;i<c.length;i++){
		    System.out.print(c[i]);
		}
	}
}
