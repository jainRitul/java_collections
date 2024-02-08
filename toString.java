import java.util.Arrays;

class toString {
    public static void main(String[] args) {
        String str[] = {"ritul","jain","dosi"};
        System.out.println(Arrays.toString(str));

        System.out.println(str);
        //for non primitive 

        Point p1[] = {new Point(1, 30),new Point(2, 20)};
        System.out.println(Arrays.toString(p1));
    }
}
/**
 * Point
 */
class Point {
    int x;
    int y;
    Point(int x,int y){
        this.x = x;
        this.y =y;
    }
    public String toString(){
         return "(" + x+","+y+")";
    }
    
}
