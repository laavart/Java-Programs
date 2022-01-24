import java.lang.annotation.Documented;
import java.util.TreeSet;

/**
 * Comparable Interface is used to set a way to compare two objects
 */

class Point implements Comparable<Point>{
    int x;
    int y;

    Point(){
        x = 0;
        y = 0;
    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        if(this.x < p.x) return -1;
        else if(this.x > p.x) return 1;
        else{
            if(this.y < p.y) return -1;
            else if(this.y > p.y) return 1;
            else return 0;
        }
    }

    /**
     * It is also preferred to set,
     * toString() method
     */

    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
}

public class s20220124_3 {
    public static void main(String... Args){
        TreeSet<Point> t = new TreeSet<>();
        t.add(new Point(1,4));
        t.add(new Point(2,3));
        t.add(new Point(1,1));
        t.add(new Point(2,2));
        t.add(new Point());
        System.out.println(t);
    }
}
