import java.util.*;
public class DFS_TRYING {
    private LinkedList<Integer> adjecency[];
    public DFS_TRYING(int v){
        adjecency= new LinkedList[v];
        for(int i=0;i<v;i++){
            adjecency[i]= new LinkedList<Integer>();

        }
    }
    public void insertEdge(int s,int d){
        adjecency[s].add(d);
        adjecency[d].add(s);


    }


public void dfs(int source){
    boolean Visited_nodes[]= new boolean[adjecency.length];
    int parent_nodes[]= new int[adjecency.length];
    Stack<Integer> stk= new Stack<>();
    stk.push(source);
    Visited_nodes[source]=true;
    parent_nodes[source]=-1;
    while(!stk.empty()){
        int p= stk.pop();
        System.out.println(p);
        for(int i:adjecency[p]){
            if(Visited_nodes[i]!=true){
                Visited_nodes[i]=true;
                stk.push(i);
                parent_nodes[i]=p;
            }
        }
    }
}


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the verxtex and edge:- ");
        int v= sc.nextInt();
        int e= sc.nextInt();
        DFS_TRYING b= new DFS_TRYING(v);
        System.out.println("Enter Edges: ");
        for(int i=0;i<e;i++){
            int s= sc.nextInt();
            int d=sc.nextInt();
            b.insertEdge(s,d);
        }
        System.out.println("Enter source for dfs travarsel:- ");
        int source= sc.nextInt();
        b.dfs(source);

    }
}
