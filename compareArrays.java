import java.util.Arrays;

class compareArrays {
    public static void main(String[] args) {
        Integer a[] = {1,2,-44};
        Integer b[] ={1,2,null};
        int res = Arrays.compare(a, b);
        if(res == 0)
         System.out.println("both are same");
        else if(res > 0){
            System.out.println("a is greater");
        } 
        else {
            System.out.println("b is greater");
        }

        String arr[] = {"Ritul","Jain"};
        String arr1[] = {"ritul","jain"};
        if(Arrays.compare(arr,arr1) == 0){
           System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
