class Node
{
    public int data;
    public Node left;
    public Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Tree{
    public Node root=null;
    
    void insert(int data){
        Node newnode=new Node(data);
        if(root==null)
        {
            root = newnode;
        }
       else
    {
        Node temp = root;
        while (true)
        {
            if (temp.data > data)
            {
                if (temp.left == null)
                {
                    temp.left = newnode;
                    break;
                }
                temp = temp.left;
            }
            else if(temp.data < data)
            {
                if(temp.right == null)
                {
                    temp.right = newnode;
                    break;
                }
                temp = temp.right;
            }
        }
    }

}
    void inorder(Node node){
        if(node != null){
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
    
    void preorder(Node node){
        if(node != null){
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }
    
    void postorder(Node node){
        if(node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
    
    
}
public class Main
{
    public static void main(String[]args)
    {
        Tree t=new Tree();
        t.insert(100);
        t.insert(50);
        t.insert(75);
        t.insert(25);
        t.insert(2);
        t.insert(150);
        t.insert(80);
        t.insert(125);
        System.out.println("the inorder");
        t.inorder(t.root);
        System.out.println("\nthe preorder");
        t.preorder(t.root);
        System.out.println("\nthe postorder");
        t.postorder(t.root);
    }
}