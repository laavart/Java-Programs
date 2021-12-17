public class d1025 {

    static void maxEquilibriumSum(int[] a){
        int sum = 0;
        for(int i : a){
            sum+=i;
        }

        int max = Integer.MIN_VALUE;
        int c=0;
        for(int i : a){
            c+=i;
            if(c == sum-c+i && max<c){
                max = c;
            }
        }

        System.out.println(max);
    }

    static void leaderElements(int[] a){
        /*
        int l = a.length;

        for(int i=0; i<l; i++){
            for(int j=i; j<l; j++){
                if(a[i]<a[j]){
                    break;
                }
                else if(j == l-1){
                    System.out.println(a[i]);
                }
            }
        }
        */

        int max = Integer.MIN_VALUE;
        for(int i=a.length-1; i>=0; i--){
            if(a[i]>max){
                max = a[i];
                System.out.println(max);
            }
        }
    }

    public static void main(String[] Args) throws Exception{
        int[] a = {-2,5,3,1,2,6,-4,2};
        maxEquilibriumSum(a);

        int[] b = {16,17,4,3,5,2};//{7,6,4,5,0,1};
        leaderElements(b);
    }
}
