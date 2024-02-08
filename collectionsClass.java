import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*

   methods for collection are min ,max , disjoint,frequency,
   methods for list - reverse,sort,replace,binarysearch ,copy ,replacAll,lastIndexOfSubList,IndexOfSubList,swap,rotate,
   methods -- synchronizedList,synchronizedMap,synchronizedSet,unmodifiable version of all three ,reverseOrder

 */
class collectionsClass {
    public static void main(String[] args) {
        List<Integer>l = new ArrayList<>();
        l.add(30);
        l.add(40);
        l.add(10);
        l.add(20);
     
        Collections.sort(l);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
    }
}
