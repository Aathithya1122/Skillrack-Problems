import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int min=Math.min(x,y),max=Math.max(x,y);
        long v=1;
        min++;
        for(;min<=max;min++){
            v*=min;
        }
        System.out.println(v);
	}
}
