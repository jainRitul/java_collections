import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
    public static void freq(int arr[]){
        LinkedHashMap<Integer,Integer>l = new LinkedHashMap<>();
        for(int i =0;i<arr.length;i++){
            l.put(arr[i], l.getOrDefault(arr[i],0)+1);
        }
        System.out.println(l);
    }
    public static void main(String[] args) {
      int arr[]  = {10,20,30,10,30};
       
      freq(arr);

        // HashMap<String, Integer> m  = new HashMap<>(); 

        // // Add elements to the map 
        // m.put("gfg", 10); 
        // m.put("ide", 15); 
        // m.put("courses", 20); 

        // // Print size and content
        // System.out.println(m); 
        // System.out.println(m.size()); 
        
        // Iterating over HashMap 
        // for(Map.Entry<String, Integer>e : m.entrySet())
        //     System.out.println(e.getKey() + " " + e.getValue());


    }
    public class Entry<T1, T2> {

        public Integer getKey;

        public int getValue() {
            return 0;
        }

        public int getKey() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getKey'");
        }
    }
}
