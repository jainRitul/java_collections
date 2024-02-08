import java.util.Arrays;
import java.util.HashMap;

class keepingIndexAfterSorting {
    public static void main(String[] args) {
        int arr[] = {10,20,50,30,40};
        keepingIndexAfterSortingSol(arr);
    }


    static void keepingIndexAfterSortingSol(int arr[]){
        HashMap<Integer,Integer>hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
           hm.put(arr[i], i);
        }
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            
           int getIndex = hm.get(arr[i]); 
           System.out.println(arr[i] + " " + getIndex);
        }

    }
}
