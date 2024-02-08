import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.management.ObjectName;

class frequencyCMethod {
    public static void main(String[] args) {
        List<Point>l = new ArrayList<Point>();
        l.add(new Point(10, 20));
        l.add(new Point(10, 20));
        l.add(new Point(10, 20));
        l.add(new Point(1, 0));
        Point p = new Point(10, 20);
        int res = Collections.frequency(l, p);

        System.out.println(res);
    }
}

class Point {

    int x;
    int y;
    Point(int x,int y){
        this.x = x;
        this.y =y;

    }
     @Override
     public boolean equals(Object o){
       if(o==this)return true;
       if(!(o instanceof Point))
       return false;
       Point p = (Point)o;
       return p.x == x && p.y ==y;
     }
  
}