import java.io.BufferedReader;
import java.io.InputStreamReader;

public class d1020 {

    static int swapNibblesInAByte(int a){
        byte l = (byte) (a<<4);
        byte r = (byte) (a>>4);
        a = l | r;
        return 0xff & a;
    }

    static int karatsubaAlgo(int m, int n){
        if(m<10 || n<10){
            return m*n;
        }
        else{
            int a = karatsubaAlgo(m/10,n/10);
            int c = (m%10) * (n%10);
            int b = karatsubaAlgo( (m/10)+(m%10) , (n/10)+(n%10))-a-c;
            return (a*100 + b*10 + c);
        }
    }

    static void shiftElements(int[] a, int k){
        int l = a.length;

        if(k >= a.length){
            System.out.println("Array Index Out of Bounds Exception!!!");
            return;
        }

        int[] b = new int[k];
        System.arraycopy(a, 0, b, 0, k);

        int i=0;
        while(i < l-k){
            a[i] = a[i + k];
            i++;
        }

        for(int x: b){
            a[i++] = x;
        }

        for(int x: a){
            System.out.println(x);
        }
    }

    static int maximumProductSubarray(int[] a){
        int len = a.length;

        int l = 0;
        int r = 1;
        int max = Integer.MIN_VALUE;
        for(int x: a){
            if(x >= 0){
                max = 0;
                break;
            }
        }

        for(int i=0; i<len; i++){

            if(a[i] != 0){

                r*=a[i];

                if(i == len-1){

                    for(int j = i; j>=l; j--){

                        if(r > max){
                            max = r;
                        }

                        r/=a[j];
                    }
                }
            } else{

                for(int j = i-1; j>=l; j--){

                    if(r > max){
                        max = r;
                    }

                    r/=a[j];
                }

                l = i+1;
                r = 1;
            }
        }
        return max;
    }

    public static void main(String[] Args) throws Exception {
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println(swapNibblesInAByte(Integer.parseInt(bRead.readLine())));

        //System.out.println(karatsubaAlgo(Integer.parseInt(bRead.readLine()), Integer.parseInt(bRead.readLine())));

        int[] a = {1,2,3,4,5,6,7,8};
        //shiftElements(a, Integer.parseInt(bRead.readLine()));

        int[] b = {2,3,-2,4};//{-2,0,-1};//{6,-3,-10,0,2};
        System.out.println(maximumProductSubarray(b));
    }
}