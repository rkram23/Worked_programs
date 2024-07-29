import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		
		System.out.print("Enter Player1 Name : ");
		String name1=sc.nextLine();
		
		System.out.print("Enter Player2 Name : ");
		String name2=sc.nextLine();
		System.out.println("------------------------------------------------");
		System.out.println("              Hello "+name1+" and "+name2);
		System.out.println("------------------------------------------------");
		System.out.println("-> Computer has 5 integers b/w 1 to 10 in mind");
		System.out.println("-> Each of you have 2 turns to guess ");
		System.out.println("------------------------------------------------");
		System.out.println("            > ---Are you Ready --- <");
		System.out.println("------------------------------------------------");
		
		List<Integer> num=new ArrayList<>();
		
		List<Integer> player1=new ArrayList<>();
		List<Integer> player2=new ArrayList<>();
		
		while(num.size()<5)
		{
		    int n=random.nextInt(10)+1;
		    if(!num.contains(n))
		        num.add(n);
		}
		
		
		
		int score1=0,score2=0;
		
		for(int i=0;i<3;i++)
		{
		    System.out.println("--------------------> TURN "+(i+1)+ "<---------------------");
		    System.out.print(name1+" > Enter your guess : ");
		    int p1=sc.nextInt();
		
		    while(player1.contains(p1) || player2.contains(p1))
		    {
		        System.out.println("Already taken");
		        System.out.print(name1+" > Enter your guess : ");
		        p1=sc.nextInt();
		    }
		    player1.add(p1);
		    if(num.contains(p1))
		    {
		        System.out.println(name1+" Your Guess is Correct ");
		        score1++;
		    }
		    else{
		        System.out.println("Wrong Choice");
		    }
		    
		    System.out.print(name2+" > Enter your guess : ");
		    int p2=sc.nextInt();
		
		    while(player1.contains(p2) || player2.contains(p2))
		    {
		        System.out.println("Already taken");
		        System.out.print(name2+" > Enter your guess : ");
		        p2=sc.nextInt();
		    }
		    player2.add(p2);
		    if(num.contains(p2))
		    {
		        System.out.println(name2+" Your Guess is Correct ");
		        score2++;
		    }
		    else
		        System.out.println("Wrong Choice");
		    
		}
		System.out.println("=========================================");
		System.out.println(name1+" choosen : "+ player1);
		System.out.println(name1+" Score : " +score1);
		System.out.println("=========================================");
		System.out.println(name2+" choosen : "+ player2);
		System.out.println(name2+" Score : "+score2);
		System.out.println("=========================================");
		if(score1>score2)
		    System.out.println(name1+" Wins!");
		else if(score2>score1)
		    System.out.println(name2+" Wins!");
		else
		    System.out.println("Match Drawww");
	}
}