import java.util.SortedMap;
import java.util.TreeMap;
import java.util.*;
class DSusingTreeMap {
    public static void main(String[] args) {
       Myds ds = new Myds();
       ds.add(1,"Ritul");
       ds.add(2,"Jain");
       ds.add(3,"Engineer");
       ds.add(4,"Dosi");
       ds.add(5,"Kalinjara");
    //    System.out.println(find(1));
    ds.printSorted();
    ds.printGreterSorted(3);
    ds.smallersorde(3);

    }
}
/**
 * 
 */
class  Myds{
  TreeMap<Integer,String>m;
    Myds(){
        m=  new TreeMap<Integer,String>();
    }
    void add(int id,String value){
        m.put(id, value);
    }
    String find(int id){
        String res = m.get(id);
        if(res == null)return "";
        return res;
    }
    void printSorted(){
        for(Map.Entry<Integer,String> e:m.entrySet()){
            System.out.print(e.getValue()+" "+e.getKey()+" ");
        } System.out.println();
    }
    void printGreterSorted(int id){
         SortedMap<Integer,String>s = m.tailMap(id);
          for(Map.Entry<Integer,String> e:m.entrySet())
            System.out.print(e.getValue()+" "+e.getKey() +' ');
        
          System.out.println();
    }
    void smallersorde(int id){
       SortedMap<Integer,String>s = m.headMap(id);
          for(Map.Entry<Integer,String> e:m.entrySet())
            System.out.print(e.getValue()+" "+e.getKey()+" ");
          System.out.println();
    }

}


