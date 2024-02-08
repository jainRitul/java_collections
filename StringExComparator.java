import java.util.Arrays;
import java.util.Comparator;
class StringExComparator {
    public static void main(String[] args) {
        String arr[] = {"ritul","Jain","Ritul"};
        Arrays.sort(arr,String::compareToIgnoreCase);
        // System.out.println(arr);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");

        String[] arr1 = {"gfg", null, "ide", null};
        Arrays.sort(arr, Comparator.nullsFirst(
            Comparator.naturalOrder()));
        System.out.println(Arrays.toString(arr1));
    }
}
