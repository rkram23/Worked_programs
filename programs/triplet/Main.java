import java.util.*;

public class Main
{
	public static void main(String[] args) {
	
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    for(int i=0;i<=n;i++)
	    {
	        for(int j=i+1;j<=n;j++)
	        {
	            for(int k=j+1;k<=n;k++)
	            {
	                if((i*i)+(j*j)==(k*k) && coprime(i,j) && coprime(j,k) && coprime(i,k))
	                    System.out.println(i+" "+j+" "+k);
	            }
	        }
	    }
	}
	    public static boolean coprime(int i,int j){
	        return gcd(i,j)==1;
	    }
	    public static int gcd(int a,int b)
	    {
	        while(b!=0)
	        {
	            int temp=b;
	            b=a%b;
	            a=temp;
	        }
	        return a;
	    }
	
}