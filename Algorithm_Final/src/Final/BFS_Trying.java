package Final;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Trying {
    private LinkedList<Integer> adjecency[];
    BFS_Trying(int v){
        adjecency= new LinkedList[v];
        for(int i=0;i<v;i++){
            adjecency[i]= new LinkedList<>();
        }

    }
    public void insertEdge(int s,int d){
        adjecency[s].add(d);
        adjecency[d].add(s);
    }

    private void bfs(int source) {
        boolean visited_nodes[]=  new boolean[adjecency.length];
        int parent_nodes[]= new int[adjecency.length];
        Queue<Integer> q= new LinkedList<>();
        q.add(source);
        visited_nodes[source]= true;
        parent_nodes[source]=-1;
        while(!q.isEmpty()){
            int p= q.poll();
            System.out.println(p);
            for(int i: adjecency[p]){
                if(visited_nodes[i]!=true){
                    visited_nodes[i]=true;
                    q.add(i);
                    parent_nodes[i]=p;
            }
        }
    }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the vertex and edge:- ");
        int  v= sc.nextInt();
        int e= sc.nextInt();
        BFS_Trying  g= new BFS_Trying(v);
        System.out.println("Enter the edges:- ");
        for(int i=0;i<e;i++){
            int s= sc.nextInt();
            int d= sc.nextInt();
            g.insertEdge(s,d);
        }
        System.out.println("Enter the source for bfs travarsel:- ");
        int source= sc.nextInt();
        g.bfs(source);
    }}
