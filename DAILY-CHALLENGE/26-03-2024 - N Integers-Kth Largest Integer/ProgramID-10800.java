import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		Set<Integer> set=new TreeSet<>();
		for(int i=0;i<n;i++){
		    set.add(sc.nextInt());
		}
		List<Integer> list=new ArrayList<>(set);
		System.out.println(list.get(list.size()-k));
	}
}
