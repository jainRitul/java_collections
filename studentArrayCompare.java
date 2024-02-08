import java.util.Arrays;
import java.util.Comparator;

class studentArrayCompare {
    public static void main(String[] args) {
        Student arr[] = {new Student("Ritul",2),new Student("Prinjal", 21),new Student("Ritul", 3),new Student("Harshit", 16)};
        Arrays.sort(arr,Comparator.comparing(Student::getName).thenComparing(Student::getRoll));
        System.out.println(Arrays.toString(arr));
    }
}
/**
 * Student
 */
class Student {

    String name;
    int roll_no;
    Student(String n,int r){
        name = n;
        roll_no=r;
    }
    String getName(){
        return name;
    }
    int  getRoll(){
        return roll_no;
    }
   public String toString(){
        return "(" + name +","+roll_no+")";
    }

}
