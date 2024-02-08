import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//can you list methods on array by using asList method of array which makes a wrapper list over exciting array

class ListMethodInCollection {
    public static void main(String[] args) {
        Integer a[] = {45,2,1,4};
        List<Integer>l = Arrays.asList(a);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
        Collections.fill(l,4);
        System.out.println(l);


        //binarySearch
        System.out.println(Collections.binarySearch(l, 4));

    }
}
