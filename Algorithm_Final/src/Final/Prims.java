package Final;
import java.util.*;

class Prims {

    public void Prim(int G[][], int V) {

        int INF = 9999999;

        int no_edge;


        boolean[] selected = new boolean[V];

        Arrays.fill(selected, false);

        no_edge = 0;


        selected[0] = true;


        System.out.println("Edge : Weight");

        while (no_edge < V - 1) {


            int min = INF;
            int x = 0;
            int y = 0;

            for (int i = 0; i < V; i++) {
                if (selected[i] == true) {
                    for (int j = 0; j < V; j++) {

                        if (!selected[j] && G[i][j] != 0) {
                            if (min > G[i][j]) {
                                min = G[i][j];
                                x = i;
                                y = j;
                            }
                        }
                    }
                }
            }
            System.out.println(x + " - " + y + " :  " + G[x][y]);
            selected[y] = true;
            no_edge++;
        }
    }

    public static void main(String[] args) {
        Prims g = new Prims();

        int V = 5;

        int[][] G = { { 0, 9, 75, 0, 0 }, { 9, 0, 95, 19, 42 }, { 75, 95, 0, 51, 66 }, { 0, 19, 51, 0, 31 },
                { 0, 42, 66, 31, 0 } };

        g.Prim(G, V);
    }
}
