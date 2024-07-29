import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Amt: ");
        int amt=sc.nextInt();
        int n1=amt/5;
        System.out.println("5 rps : "+n1);
        int bl1=amt-(5*n1);
        int n2=bl1/2;
        System.out.println("2 rps : "+n2);
        int bl2=bl1-(2*n2);
        int n3=bl2/1;
        System.out.println("1 rps : "+n3);
        int tot=n1+n2+n3;
        System.out.println("Total coins: "+tot);
    
    
        
    }
}