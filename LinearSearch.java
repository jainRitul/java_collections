class LinearSearch{
    public static void main(String[] args) {
        int arr[] = {10,3,2,5};
        int x = 5;
        linearSearch(arr,x);
    }
    public static void linearSearch(int  arr[],int x){
      for(int i=0;i<arr.length;i++){
        if(x == arr[i]){
        System.out.println("Element found at index :" + i);
        return;}
      }
      System.out.println("Element not found at all");
    }
}