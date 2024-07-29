import java.util.*;

class Graph
{
    ArrayList<ArrayList<Integer>> list;
    public Graph(int v)
    {
        list =new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            list.add(new ArrayList<>());
        }
    }
    public void Addedge(int a,int b)
    {
        list.get(a).add(b);
        list.get(b).add(a);
    }
    public void display()
    {
        for(int i=0;i<list.size();i++){
            System.out.println("\nNode Connected to : \n"+i);
            for(int j=0;j<list.get(i).size();j++){
                System.out.print("->"+list.get(i).get(j));
            }
        }
    }
}

public class Main
{
	public static void main(String[] args) {
	Graph g=new Graph(5);
	g.Addedge(0,1);
	g.Addedge(0,4);
	g.Addedge(0,3);
	g.Addedge(1,2);
	g.Addedge(1,3);
	g.Addedge(2,4);
	g.Addedge(2,3);
	g.Addedge(3,4);
	g.display();
	
	}
}