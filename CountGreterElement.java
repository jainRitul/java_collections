import java.util.Collections;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * CountGreterElement
 */
class CountGreterElement {
  public static void main(String[] args) {
    int arr[] = {10,3,4,20};
    countGreter(arr); 
  }
  public static void countGreter(int arr[]){
    int n = arr.length;
    TreeMap<Integer,Integer>m = new TreeMap<>(Collections.reverseOrder());
    for(int i=0;i<n;i++){
        m.put(arr[i], m.getOrDefault(arr[i], 0)+1);
    }
    int cum = 0;
    for(Entry<Integer, Integer> e:m.entrySet()){
        int temp = e.getValue();
        m.put(e.getKey(), cum);
        cum+=temp;
    }
    for(int x : arr){
        System.out.print(m.get(x)+" ");
    }
  }
    
}
