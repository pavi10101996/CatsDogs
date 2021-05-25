import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class CatsDogs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int d = sc.nextInt();
		    int c = sc.nextInt();
		    int count = sc.nextInt();
		    if(count % 4 != 0){
		        System.out.println("NO");
		        continue;
		    }
		    if(count > (d*4 + c*4)){
		         System.out.println("NO");
		         continue;
		    }
		    int min = 4*d;
		    if(c > d){
		        c-=d;
		        if(c>d){
		            c-=d;
		            min += (4*c);
		        }
		    }
		    if(count < min){
		        System.out.println("NO");
		         continue;
		    }
		    System.out.println("YES");
		    
		}
	}
}