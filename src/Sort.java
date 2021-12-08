public class Sort {

    static void bSort(int a[]){
        int n = a.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                int k = j+1;
                if(a[k] < a[j]){
                    int t = a[k];
                    a[k] = a[j];
                    a[j] = t;
                }
            }
        }
        for(int x: a)
            System.out.println(x);
    }

    static void sSort(int a[]){
        for(int i=0; i<a.length; i++){
            int mn = i;
            for(int j=i; j<a.length; j++){
                if(a[j]<a[mn])
                    mn = j;
            }
            if(mn!=i){
                int tmp = a[i];
                a[i] = a[mn];
                a[mn] = tmp;
            }
        }
    }

    //Merge Sort Utility
        private static void merge(int a[], int l, int m,int h){

            int r[] = new int[h+1];

            int i=l, j=m+1, k=l;

            while(i<=m && j<=h){
                if(a[i]<a[j])
                    r[k++] = a[i++];
                else
                    r[k++] = a[j++];
            }

            while(i<=m)
                r[k++] = a[i++];

            while(j<=h)
                r[k++] = a[j++];

            for (i=l; i<=h; i++)
                a[i] = r[i];
        }

    static void mSort(int a[]){
        int n=a.length, p=2;

        while(p<=n){
            for(int i=0; i+p-1<n; i+=p){
                int low = i;
                int high = i+p-1;
                int mid = (low+high)/2;
                merge(a,low,mid,high);
            }
            p*=2;
        }

        if(p/2<n){
            merge(a,0,p/2-1,n-1);
        }
    }


    static void qSort(int a[], int low, int high){
        if(low<high){
            int l = a.length;
            int i = low+1, j = high-1;

            while(i<=j){
                if(a[i]>a[low] && a[j]<a[low]){
                    a[i] = a[i]^a[j];
                    a[j] = a[i]^a[j];
                    a[i] = a[i++]^a[j--];
                }
                else{
                    if(a[i]<a[low])
                        i++;
                    if(a[j]>a[low])
                        j--;
                }
            }

            if(low != j){
                a[low] = a[low]^a[j];
                a[j] = a[low]^a[j];
                a[low] = a[low]^a[j];
            }

            qSort(a,low,j);
            qSort(a,j+1,high);
        }
    }
}
