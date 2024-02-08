import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
class sortingByComparatorClass {
public static void main(String[] args) {
        //User defined type
        Point p[] = {new Point(1,1),new Point(3, 30),new Point(1, 03),new Point(4, 40)};
        Arrays.sort(p,new Mycmp());
        for(int i=0;i<p.length;i++){
            System.out.println(p[i].x + " " +p[i].y);
        }
         //Primitive type
        int arr[] = {2,1,5,3,5};
        Arrays.sort(arr,1,3);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Integer a[] = {1,2,1,33};
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println(Arrays.toString(a));



        
    }
}
class Point{
    int x;
    int y;
    Point(int x,int y){
        this.x = x;
        this.y = y;

    }
}


class Mycmp implements Comparator<Point>{
   public int compare(Point p1,Point p2){
    return p1.x - p2.x;
   }
    
}
