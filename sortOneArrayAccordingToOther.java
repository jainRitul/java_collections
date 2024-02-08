import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class sortOneArrayAccordingToOther {
    public static void main(String[] args) {
        char charArr[] = {'a','e','r'};
        int intArr[] = {5,4,3};
        sortOneArrayAccordingToOther(charArr,intArr);
    }
    static void sortOneArrayAccordingToOther(char charArr[],int intArr[]){
         List<ArrayItem>l = new ArrayList<>();
         for(int i= 0;i<charArr.length;i++)
            l.add(new ArrayItem(intArr[i],charArr[i]));

        Collections.sort(l,(a1,a2)->a1.item - a2.item); 
        for(ArrayItem x : l){
            System.out.println(x.ch);
        }   
    }
}
/**
 * 
 */
class ArrayItem {
    int item;
    char ch ;
    ArrayItem(int item,char ch){
        this.item = item;
        this.ch = ch;
    }
    
}
