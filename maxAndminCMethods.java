import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*; 
import java.lang.*; 
import java.io.*; 


class maxAndminCMethods {
    public static void main(String[] args) {
        List<Point>l = new ArrayList<Point>();
        l.add(new Point(10, 200));
        l.add(new Point(210, 202));
        l.add(new Point(30, 20));
        l.add(new Point(110, 0));
        Point p = Collections.max(l);
        System.out.println(p.x + " " + p.y);
    }
}

class Point implements Comparable<Point> {

    int x;
    int y;
    Point(int x,int y){
        this.x = x;
        this.y =y;

    }
    public int compare(Point p1){
        return this.x - p1.x;
    }
  
}