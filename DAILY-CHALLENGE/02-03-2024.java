import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		    int x=s.length()-2,y=1;
		    for(int i=0;i<s.length()-2;i++){
		        int a=0,b=0;
		        for(int k=0;k<x;k++){
		            System.out.print(s.charAt(b));
		        }
		        int j=1;
		        b++;
		        if(s.length()%2==0){
		          while(b<s.length()-1){
		            if(a%2==0){
		                for(int k=0;k<y;k++){
		                    System.out.print(s.charAt(b));
		                }
		                b++;
		                for(int k=0;k<y;k++){
		                    System.out.print(s.charAt(b));
		                }
		                b++;
		            }else{
		                for(int k=0;k<x;k++){
		                    System.out.print(s.charAt(b));
		                }
		                b++;
		                for(int k=0;k<x;k++){
		                    System.out.print(s.charAt(b));
		                }
		                b++;
		            }
		            a++;
		          }
		          if((s.length()/2)%2==0){
		            j=x;
		          }else{
		            j=y;
		          }
		          for(int k=0;k<j;k++){
		            System.out.print(s.charAt(b));
		          }
		          x--;
		          y++;
		          System.out.println();
		        }else{
		            while(b<s.length()){
		                if(a%2==0){
		                    for(int k=0;k<y;k++){
		                        System.out.print(s.charAt(b));
		                    }
		                    b++;
		                    for(int k=0;k<y;k++){
		                        System.out.print(s.charAt(b));
		                    }
		                    b++;
		                }else{
		                    for(int k=0;k<x;k++){
		                        System.out.print(s.charAt(b));
		                    }
		                    b++;
		                    for(int k=0;k<x;k++){
		                        System.out.print(s.charAt(b));
		                    }
		                    b++;
		                }
		                a++;
		            }
		            if((s.length()/2)%2==0){
		                j=y;
		            }else{
		                j=x;
		            }
		            for(int k=0;k<j;k++){
		                System.out.print("*");
		            }
		            x--;
		            y++;
		            System.out.println();
		        }
		  }
	}
}
