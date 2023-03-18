package Final;

import java.util.*;

class Edge implements Comparable<Edge>{
    int src = 0;
    int dst= 0;
    int weight= 0;
    public int compareTo(Edge compareEdge)
    {
        return this.weight-compareEdge.weight;
    }
}


public class Kruskal_Algorithm  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vertex Number:- ");
        int v = sc.nextInt();
        System.out.println("Enter the edge Number:- ");
        int e = sc.nextInt();

        Edge inp[] = new Edge[e];

        for(int i =0; i <e; i++) {
            inp[i] =  new Edge();
            inp[i].src = sc.nextInt();
            inp[i].dst = sc.nextInt();
            inp[i].weight = sc.nextInt();
        }

        krushkals(inp, v, e);


    }

    private static void krushkals(Edge[] inp, int v, int e) {
        Arrays.sort(inp);
        Edge op[] = new Edge[v-1];
        int k = 0;
        int parent[] = new int[v];
        for(int i =0; i <v; i++)
            parent[i] = i;

        for(int i =0; i <e; i++) {
            if(k == v-1) break;

            Edge currEdge = inp[i];
            int src_parent = find(currEdge.src, parent);
            int dst_parent = find(currEdge.dst, parent);

            if(src_parent != dst_parent) {
                op[k] = currEdge;
                k++;
                parent[src_parent] = dst_parent;
            }
        }

        for(int i =0; i <op.length; i++)
            System.out.println(op[i].src + " ->" + op[i].dst + " ->" + op[i].weight);

    }

    private static int find(int v, int[] parent) {
        if(parent[v] == v)
            return v;
        return find(parent[v], parent);
    }

}
