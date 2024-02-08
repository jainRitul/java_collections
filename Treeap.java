import java.util.TreeMap;

class Treeap {
    public static void main(String[] args) {
        TreeMap<Integer,String>m = new TreeMap();
        m.put(10, "Ritul");
        m.put(12, "Prinjal");
        m.put(14, "Sarvesh");
        m.put(16, "Harshit");
        m.put(18, "Sharmila");
        m.put(20, "Sandeep");
        for(Map.Entry<Integer, String>e : m.entrySet())
        System.out.println(e.getKey() + " " + e.getValue());
        // for(Map.Entry<Integer,String>e : m.entrySet())
        // {
        //    System.out.print(e.getValue() +" "+ e.getKey());
        // }
       // System.out.println(m.remove(12));
        // System.out.println(m.containsKey(12));
        // System.out.println(m.remove(12,"Ritul"));
        // System.out.println(m.ceilingKey(12));
        // System.out.println(m.ceilingEntry(12));
        // System.out.println(m.floorKey(12));
        // System.out.println(m.floorEntry(12));
        // System.out.println(m.get(12));
        // System.out.println(m.lastKey());
        // System.out.println(m.lastEntry());
        // System.out.println(m.firstEntry());
        // System.out.println(m.firstKey());

        // // System.out.println(m.ge(12));
        // for(Map<Integer,String>e : m.entrySet()){

        // }

    }
}
