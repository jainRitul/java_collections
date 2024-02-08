import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

class TreeMapDs {
    public static void main(String[] args) {
       Item it  = new Item();
       it.add(20,"sugar");
       it.add(40,"Tea");
     
       it.add(40,"spcies");
       it.add(10,"chilli");
       it.add(10,"Milk");
   
     System.out.println(it.find(40));
     it.printSorted();
     it.printGreaterSorted(20);
     it.printSmallerSorted(20);
    }
}

 class Item {
     TreeMap<Integer,List<String>>m ;
    Item(){
     m= new TreeMap<Integer,List<String>>();
    }
    void add(int price,String item){
      if(m.get(price) == null){
        m.put(price, new ArrayList<>());
      }
      m.get(price).add(item);
    }
    List<String> find(int price){
       
        return  m.get(price);
      
    }
    void printSorted(){
        for(Entry<Integer, List<String>> e:m.entrySet()){
            int p = e.getKey();
            for(String x : e.getValue())
            System.out.println(x +" " +p);
        }   System.out.println();
    }
    void printGreaterSorted(int price){
        SortedMap<Integer,List<String>>t = m.tailMap(price); for(Entry<Integer, List<String>> e:m.entrySet()){
            int p = e.getKey();
            for(String x : e.getValue())
            System.out.println(x +" " +p);
        }   System.out.println();
         for(Entry<Integer, List<String>> e:t.entrySet()){
            int p = e.getKey();
            for(String x : e.getValue())
            System.out.println(x +" " +p);
        }   System.out.println();
    }
    void printSmallerSorted(int price){
        SortedMap<Integer,List<String>>t = m.headMap(price);
        for(Entry<Integer, List<String>> e:t.entrySet()){
            int p = e.getKey();
            for(String x : e.getValue())
            System.out.println(x +" " +p);
        }   System.out.println();
    }

}

