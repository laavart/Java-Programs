public class d1027 {

    static void majorityElement(int[] a){
        int l = a.length;

        for(int i=0; i<l; i++){

            int c=0;

            for(int j=i; j<l; j++){

                if(a[i] == a[j]){
                    c++;
                }
            }

            if(c >= (l/2)+1){
                System.out.println("Majority Element is: "+a[i]);
                break;
            }
            else if(i == l-1){
                System.out.println("No Majority Element Found!!!");
            }
        }
    }

    public static void main(String[] Args) throws Exception{
        System.out.println();
        int[] a = {4,4,4,5,6,8,4,4};
        majorityElement(a);
    }
}
