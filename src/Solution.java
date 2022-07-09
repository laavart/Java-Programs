import java.util.*;

class Solution {
    static List<List<Integer>> function(int... n) {
        List<List<Integer>> r = new LinkedList<>();
        Arrays.sort(n);
        int i = 0, l = n.length - 1;
        boolean c1 = true, c2 = true;
        List<Integer> t = new LinkedList<>();
        while (i < l) {
            if (c1) {
                c1 = false;
                t.addAll(List.of(n[i], Integer.MIN_VALUE, n[l]));
                if (Math.abs(n[i]) < Math.abs(n[l])) {
                    i++;
                    c2 = true;
                } else {
                    l--;
                    c2 = false;
                }
            } else {
                if ((c2 && l - 1 < 0) || i + 1 >= n.length) break;
                t.set(1, (c2 ? n[l - 1] : n[i + 1]));
                int s = t.stream().mapToInt(a -> a).sum();
                if (s == 0) {
                    if (!r.contains(t)) r.add(t);
                    t = new ArrayList<>(3);
                    c1 = true;
                } else if (Math.abs(t.get(0)) < Math.abs(t.get(2))) {
                    l--;
                    i--;
                    t.set(2, n[l]);
                } else {
                    i++;
                    l++;
                    t.set(0, n[i]);
                }
            }
        }
        return r;
    }

    public static void main(String[] Args) {
        System.out.println("Result:\n" + Solution.function(
                0,1,1
        ));
    }
}