import java.util.Arrays;

class ArraysEquals {
    public static void main(String[] args) {
        Integer arr[] = {2,4,null,3};
        Integer arr1[]={2,4,3,null};
        if(Arrays.equals(arr1,arr))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
