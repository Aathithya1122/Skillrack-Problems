import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++){
		    list.add(sc.nextInt());
		}
		int k=sc.nextInt();
		for(int i=n-1;i>=0;i--){
		    if(list.get(i)==k){
		        list.remove(i);
		        break;
		    }
		}
		for(int i=0;i<list.size();i++){
		    System.out.print(list.get(i)+" ");
		}
	}
}
