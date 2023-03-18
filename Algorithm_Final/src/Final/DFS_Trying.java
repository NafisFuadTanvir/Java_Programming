package Final;

import java.util.*;
public class DFS_Trying {

    private LinkedList<Integer> adjecency[];
    DFS_Trying(int v){
        adjecency= new LinkedList[v];
        for(int i=0;i<v;i++){
            adjecency[i]= new LinkedList<>();
        }

    }
    public void insertEdge(int s,int d){
        adjecency[s].add(d);
        adjecency[d].add(s);
    }
    public void dfs(int source){
        boolean visited_nodes[]=  new boolean[adjecency.length];
        int parent_nodes[]= new int[adjecency.length];
        Stack<Integer> s= new Stack();
        s.push(source);
        visited_nodes[source]= true;
        while(!s.isEmpty()){
            int v= s.pop();
            System.out.println(v);
            for(int i: adjecency[v]){
                if(visited_nodes[i]!=true){
                    visited_nodes[i]=true;
                    s.push(i);
                    parent_nodes[i]=v;

                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the vertex and edge:- ");
        int  v= sc.nextInt();
        int e= sc.nextInt();
        DFS_Trying  g= new DFS_Trying(v);
        System.out.println("Enter the edges:- ");
        for(int i=0;i<e;i++){
            int s= sc.nextInt();
            int d= sc.nextInt();
            g.insertEdge(s,d);
        }
        System.out.println("Enter the source for dfs travarsel:- ");
        int source= sc.nextInt();
        g.dfs(source);



    }
}
