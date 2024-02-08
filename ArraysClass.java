import java.util.Arrays;

class ArraysClass {
    public static void main(String[] args) {
        int arr[] = {10,3,2};
        int arr1[] = {10,3,2};
        System.out.println(Arrays.equals(arr1,arr));
        System.out.println(Arrays.toString(arr));



        //fill function
        Arrays.fill(arr,0,1 ,-1);
        System.out.println(Arrays.toString(arr));
        char arr2[] = {'x','f','g'};
        Arrays.fill(arr2, 'a');
        System.out.println(Arrays.toString(arr2));


        
    }
}
