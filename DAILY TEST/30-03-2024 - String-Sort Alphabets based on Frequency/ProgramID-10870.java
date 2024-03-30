import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Set<Character> set=new TreeSet<>();
		for(int i=0;i<s.length();i++){
		    set.add(s.charAt(i));
		}
		List<Character> ch=new ArrayList<>(set);
		List<Integer> count=new ArrayList<>();
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for(int i=0;i<ch.size();i++){
		    int c=0;
		    for(int j=0;j<s.length();j++){
		        if(ch.get(i)==s.charAt(j)){
		            c++;
		        }
		    }
		    max=Math.max(max,c);
		    min=Math.min(min,c);
		    count.add(c);
		}
		while(max>=min){
		    int index=-1;
		    for(int i=0;i<count.size();i++){
		        if(count.get(i)==max){
		            for(int j=0;j<max;j++){
		                System.out.print(ch.get(i));
		            }
		        }
		    }
		    max--;
		}
	}
}
