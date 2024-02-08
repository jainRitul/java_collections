import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class nonPrimitiveSortingCollections {
    public static void main(String[] args) {
        List<Point>l = new ArrayList<>();
        l.add(new Point(1, 2));
        l.add(new Point(31, 3));
        l.add(new Point(11, 1));
        l.add(new Point(51, 2));
        Collections.sort(l);
        for(Point p : l){
            System.out.println(p.x + " "+p.y);
        }
    }
}
/**
 * Point
 */
class Point implements Comparable<Point> {

    int x;
    int y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int compareTo(Point p){
        return this.x - p.x;
    }
}
