 import java.util.*;
 import java.util.Collections;
import java.util.Map.Entry;
 class TreeMap2 {
    public static void main(String[] args) {
       TreeMap<Integer,String>t = new TreeMap<>();
         t.put(1,"Ritul");
         t.put(2,"jAIN");
         t.put(3,"dOSI");
         for(Entry<Integer, Integer> e:t.entrySet()){
            System.out.print(e.getValue()+" "+e.getKey()+" ");
         }
    }
}
