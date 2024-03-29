import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int i;
		Set<Integer> set=new TreeSet<>();
		for(i=0;i<m;i++){
		    set.add(sc.nextInt());
		}
		for(i=0;i<n;i++){
		    set.add(sc.nextInt());
		}
		List<Integer> list=new ArrayList<>(set);
		for(int j : list){
		    System.out.print(j+" ");
		}
	}
}
