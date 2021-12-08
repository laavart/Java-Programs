public class d1022 {

    static void hourGlass(int[][] a){ // O(n*3*3) => O(9n) => O(n)
        int m = a.length - 3 + 1;
        int n = a[0].length -3 + 1;

        int max=0;
        for(int k=0; k < (m*n); k++){ //O(n)
            int c=0;
            for(int i=0; i<3; i++){ //O(3)
                for(int j=0; j<3; j++){ //O(3)
                    if(i!=1 || j==1){
                        int x = i + k/n;
                        int y = j + k - (k/m)*m;
                        c += a[x][y];
                    }
                }
            }
            if(c>max){
                max = c;
            }
        }

        System.out.println(max);
    }

    public static void main(String[] Args) throws Exception{

        int[][] a = {{1,2,4,5,6}, {7,5,2,3,6}, {0,0,0,0,0}, {7,5,1,3,5}, {0,0,0,0,0}};

        hourGlass(a);
    }
}
