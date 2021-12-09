import java.util.Arrays;

public class s20211201 {

    static void primMCST(int[][] g){ //Error
        int l = g.length;
        int[] n = new int[l];
        int[][] p = new int[2][l-1];

        Arrays.fill(n, Integer.MIN_VALUE);

        int u = l-1, v = l-1;
        for(int i=1; i<l; i++){
            for(int j=0; j<l; j++){
                if(g[u][v] > g[i][j]){
                    u=i;
                    v=j;
                }
            }
        }

        int k=0;
        p[0][k] = u;
        p[1][k] = v;
        n[u] = 0;
        n[v] = 0;

        for(int i=1; i<l; i++){
            if(n[i] != 0){
                n[i] = (g[i][u] < g[i][v]) ? u : v ;
            }
        }

        while(k < l-1){
            int min = Integer.MAX_VALUE, t=0;
            for(int i=1; i<l; i++){
                if(n[i] != 0){
                    if(g[i][n[i]]<min){
                        min = g[i][n[i]];
                        t = i;
                    }
                }
            }
            p[0][k] = t;
            p[1][k] = n[t];
            n[t] = 0;
            for(int i=1; i<l; i++){
                if(n[i] != 0){
                    n[i] = (g[i][t] < g[i][n[t]]) ? t : n[t] ;
                }
            }
            k++;
        }

        for(int[] x: p)
            System.out.println("("+x[0]+","+x[1]+")");
    }

    public static void main(String[] Args) throws Exception{

        int I = Integer.MAX_VALUE;
        int[][] g = {
                {I, I, I, I, I, I, I, I},
                {I, I, 25, I, I, I, 5, I},
                {I, 25, I, 12, I, I, I, 10},
                {I, I, 12, I, 8, I, I, I},
                {I, I, I, 8, I, 16, I, 14},
                {I, I, I, I, 16, I, 20, 18},
                {I, 5, I, I, I, 20, I, I},
                {I, I, 10, I, 14, 18, I, I},
        };

        primMCST(g);
    }
}
