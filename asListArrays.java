import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class asListArrays {
    public static void main(String[] args) {
        String arr[] = {"ritul","jain","jain","engineer"};
        List<String>l = Arrays.asList(arr);
        System.out.println(l);
        // l.add("hii"); we can't add or remove from list beacuse list is working in the same space of array it's a wraapper over array
        arr[0] = "Ritul";
        System.out.println(l);
        l.set(0,"Er. Ritul Jain");
        System.out.println(l);


        //using these asList method we can give it to any collection
        //can create collection from array element
        
        HashSet<String>s = new HashSet<>(Arrays.asList(arr));
        System.out.println(s);
    }
}
