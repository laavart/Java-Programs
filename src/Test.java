import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Double[] a = new Double[nums1.length + nums2.length];
        int l = 0;
        for(var x: nums1) a[l++] = (double) x;
        for(var x: nums2) a[l++] = (double) x;
        Arrays.sort(a);
        return l%2 == 1 ? a[l/2] : (a[l/2-1]+a[l/2])/2 ;
    }
}

public class Test {
    public static void main(String... Args) {
        int[] a = {1,3};
        int[] b = {2};
        System.out.println((new Solution()).findMedianSortedArrays(a,b));
    }
}
