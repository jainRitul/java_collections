import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class keepingIndexAfterSortingByArrayList {
    public static void main(String[] args) {
        int arr[] = {20,10,30,30,59};
        keepingIndexAfterSorting(arr);
    }
    public static void keepingIndexAfterSorting(int arr[]){
      List<ArrayItem>l = new ArrayList<>();
      for(int i = 0; i < arr.length ; i++ )
        l.add(new ArrayItem(arr[i] ,i));
      Collections.sort(l,(a1,a2)->a1.item - a2.item);
      for(ArrayItem x : l ){
        System.out.println(x.item + " " + x.idx);
      }


      
    }
}

class ArrayItem {
      int item;
      int idx;
      ArrayItem(int item,int idx){
        this.idx = idx;
        this.item = item;
      }
    
}
