import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class studentArraySortAccToMarks {
    public static void main(String[] args) {

        int roll[] = {1,2,4,7};
        int marks[] = {30,20,40,23};
        printMarks(roll,marks);
    }
    static void printMarks(int roll[] , int marks[]){
          int n = roll.length;
          List<Student>l = new ArrayList<>();

          for(int i=0;i<n;i++)
            l.add(new Student(roll[i], marks[i]));
          
          Collections.sort(l,new Mycmp());

          for(Student x : l){
            System.out.println(x.roll + " " + x.marks);
          }

    }
}

/**
 * Student
 */
class Student {
   int roll;
   int marks;
   Student(int r,int m){
    roll = r;
    marks = m;
   }
    
}
class Mycmp implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s2.marks - s1.marks;
    }
}
