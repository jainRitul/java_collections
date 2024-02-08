import java.util.Arrays;
import java.util.Comparator;
class BinarySearchArraysClassByComparator {


    public static void main(String[] args) {
        Point arr[] = {new Point(1, 2),new Point(3, 30),new Point(4, 40)};
        Point p = new Point(3,30);
        System.out.println(Arrays.binarySearch(arr, p,new Mycmp()));

    }
}
class Point  {

    int x;
    int y;
    Point(int x,int y){
        this.x = x;
        this.y = y;

    }
   
}

 class Mycmp implements Comparator<Point> {
   public int compare(Point p1,Point p2){
    return p1.x - p2.x;
   }
    
}


