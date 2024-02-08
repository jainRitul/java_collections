  import java.util.*;
class moreThanoneitemTreeMap {
  

    public static void main(String[] args) {
       Myds ds = new Myds();
       ds.add(1,"Ritul");
       ds.add(1,"chiku");
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
  TreeMap<Integer,List<String>>m;
    Myds(){
         m =  new TreeMap<Integer,List<String>>();
    }
    void add(int id,String value){
        if(m.get(id)==null)
        m.put(id,new ArrayList<>());
        m.get(id).add(value);
    }
    List<String> find(int id){
       return m.get(id);
    }
    void printSorted(){
        for(Map.Entry<Integer,String> e:m.entrySet()){
            int p  = e.getKey();
            for(String s : e.getValue())
            System.out.print(s+" "+p+" ");
        } System.out.println();
    }
    void printGreterSorted(int id){
         SortedMap<Integer,String>s= m.tailMap(id);
         for(Map.Entry<Integer,String> e:m.entrySet()){
            int p  = e.getKey();
            for(String st : e.getValue())
            System.out.print(st+" "+p+" ");
        } System.out.println();
    }
    void smallersorde(int id){
       SortedMap<Integer,String>s = m.headMap(id);
         for(Map.Entry<Integer,String> e:m.entrySet()){
            int p  = e.getKey();
            for(String st: e.getValue())
            System.out.print(st+" "+p+" ");
        } System.out.println();
    }

}

