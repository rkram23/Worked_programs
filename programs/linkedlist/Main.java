import java.util.*;
class Linkedlist{
    Node head;
    class Node {
        int data;
        Node next;
 
    Node(int val){
        data=val;
        next=null;
    }
    }
    Linkedlist(){
        head=null;
    }
    
    void insertBeg(int val){
        Node newnode=new Node(val);
        if(head==null)
            head=newnode;
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    void insertPos(int pos,int val){
        if(pos==0){
            insertBeg(val);
            return;
        }
        else{
        Node inode=new Node(val);
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
            if(temp==null){
                System.out.print("oooo");
                return;
            }
        }
        inode.next=temp.next;
        temp.next=inode;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
    }
    
    public void deleteBeg(){
        head=head.next;
        return;
    }
    
    public void deletePos(int pos){
        Node prev=null;
        Node temp=head;
        
        for(int i=1;i<=pos;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
}



public class Main
{
	public static void main(String[] args) {
	    Linkedlist list=new Linkedlist();
        int n;
	do{
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter You Choice:");
    	System.out.println("1.InsertAtBegining \n2.InsertAtPosition \n3.DeleteAtPos \n4.Display \n5.Exit");
    	 n=sc.nextInt();
    	switch(n){
    	    case 1: {
    	        System.out.println("Inserting");
    	        System.out.println("Enter Number:");
    	        int num=sc.nextInt();
    	        list.insertBeg(n);
    	        break;
    	    }
    	    case 2: {
    	        System.out.print("Inserting at postion");
    	        System.out.println("Enter pos:");
    	        int pos=sc.nextInt();
    	        System.out.println("Enter Number:");
    	        int num=sc.nextInt();
    	        list.insertPos(pos,num);
    	        break;
    	    }
    	    case 3: {
    	        System.out.println("Deleting");
    	        System.out.println("Enter postion:");
    	        int pos=sc.nextInt();
    	        list.deletePos(pos);
    	        break;
    	    }
    	    case 4: {
    	        System.out.println("Displaying");
    	        list.display();
    	        break;
    	    }
    	    case 5: {
    	        System.out.println("Exiting");
    	        break;
    	    }
    	}
	    
	}while(n<=5);
	}
}