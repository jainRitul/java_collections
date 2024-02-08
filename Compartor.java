import java.sql.Array;
import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.lang.*;
class Compartor{
    public static void main(String[] args) {
       Point arr[] = {new Point(1, 10),new Point(3, 30),new Point(4, 40),new Point(2, 20)};
    //    Arrays.sort(arr,new Mycmp());
       //By using lambad function these will be more easy 
       Arrays.sort(arr,(p1,p2)->p1.x - p2.x);
       System.out.println(Arrays.toString(arr));
        
    }
}

//There is no need of these class if we are using lambda function
// class Mycmp implements Comparator<Point>
// {
//    public int compare(Point p1 ,Point p2)
//    {
//        return p1.x - p2.x;
//    }
    
// }
class Point {
  int x ;
  int y;
  Point(int x,int y)
  {
    this.x= x;
    this.y= y;
  }
  public String toString(){
    return "("+x+","+y+")";
  }

    
}