import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;


class decreasingOrderOfFreq {
   public static void main(String[] args) {

    int arr[] = {20,20,20,30,10,30,10};

    getFreqBasedArr(arr);

    for(int i=0;i<arr.length;i++)
    System.out.println(arr[i]+" ");

   }

   static void getFreqBasedArr(int arr[]){

      HashMap<Integer,Integer> m = new HashMap<>();
      for(int i=0;i<arr.length;i++)
        m.put(arr[i], m.getOrDefault(arr[i], 0)+1);
      
      List<List<Integer>> l = new ArrayList<>();

      for(int i=0;i<=arr.length;i++)
        l.add(new ArrayList<>());
      
    /*  //by these order of insertion not maintaained so another approach 
     for(Entry<Integer, Integer> e : m.entrySet())
       l.get(e.getValue()).add(e.getKey());
     */ 
        for(int i=0;i<arr.length;i++){
            int f = m.get(arr[i]);
            if(f!=-1){
                l.get(f).add(arr[i]);
                m.put(arr[i], -1);
            }
        }
       
      int idx = 0;
      for(int i = arr.length ;i >= 0 ;i--){
        for(int x : l.get(i) ){
            for(int j =0;j<i;j++){
                arr[idx++] = x;
            }
        }
      } 
   }
    
}