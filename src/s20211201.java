import java.util.Arrays;

public class s20211201 {

    static void primMCST(int[][] g){ //Error
        int l = g.length;

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
        int[] n = new int[l];
        Arrays.fill(n, Integer.MAX_VALUE);
        int[][] p = new int[2][(l-2)];
        p[0][k] = u;
        p[1][k++] = v;
        n[u] = 0;
        n[v] = 0;

        for(int i=1; i<l; i++){
            if(n[i] != 0)
                n[i] = (g[i][u] < g[i][v]) ? u : v ;
        }

        while(k < l-2){
            int min = n[0], t=0;
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
            for(int i=1; i<l; i++){
                if(n[i] != 0){
                    n[i] = (g[i][t] < g[i][n[t]]) ? t : n[t] ;
                }
            }
            n[t] = 0;
            k++;
        }

        for(int i=0; i<l-2; i++)
            System.out.println("("+p[0][i]+","+p[1][i]+")");
    }

    static void sUnion(int[] s, int u, int v){
        if(s[u]<s[v]){
            s[u] += s[v];
            s[v] = u;
        }
        else{
            s[v] += s[u];
            s[u] = v;
        }
    }

    static int sFind(int[] s, int x){
        while(s[x]>0)
            x = s[x];
        return x;
    }

    static void kruskalMCST(int[][] e, int v){
        int l = e[2].length;
        int[] s = new int[v+1];
        Arrays.fill(s,-1);
        for(int i=0; i<l; i++)
            for(int j=i; j<l; j++)
                if(e[2][i]>e[2][j]){
                    e[0][i] = e[0][i]^e[0][j];
                    e[0][j] = e[0][i]^e[0][j];
                    e[0][i] = e[0][i]^e[0][j];
                    //**
                    e[1][i] = e[1][i]^e[1][j];
                    e[1][j] = e[1][i]^e[1][j];
                    e[1][i] = e[1][i]^e[1][j];
                    //**
                    e[2][i] = e[2][i]^e[2][j];
                    e[2][j] = e[2][i]^e[2][j];
                    e[2][i] = e[2][i]^e[2][j];
                }
        for(int i=0; i<l; i++){
            int x = sFind(s, e[0][i]);
            int y = sFind(s, e[1][i]);

            if( x != y){
                sUnion(s,x,y);
                System.out.println("("+e[0][i]+","+e[1][i]+")");
            }
        }
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
        System.out.println("Prim:");
        primMCST(g);
        System.out.println("Kruskal:");
        int[][] e = {
                {1,2,3,4,5,6,7},
                {2,3,4,5,6,7,1},
                {2,4,3,1,8,6,2}
        };
        kruskalMCST(e,7);
    }
}
