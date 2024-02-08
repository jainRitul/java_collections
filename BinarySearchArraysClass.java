import java.util.Arrays;

class BinarySearchArraysClass {
    public static void main(String[] args) {
        Point arr[] = {new Point(1, 2),new Point(3, 30),new Point(4, 40)};
        Point p = new Point(6,30);
        System.out.println(Arrays.binarySearch(arr, p));

    }
}
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
