import java.util.Arrays;
//mismatch fun was introduced in java 1.9 
//mismatch fun has the appliction of *longest prefix array of two array*

class mismatchArrays {
    public static void main(String[] args) {
        int a[] = {1,3,4,5};
        int b[] = {1,3,4,4,4,5};
        System.out.println(Arrays.mismatch(a, b));
        String arr[] = {"GFG","Courses"};
        String brr[] = {"gfg","courses","ritul"};
        System.out.println(Arrays.mismatch(arr, brr,String::compareToIgnoreCase));
    }
}
