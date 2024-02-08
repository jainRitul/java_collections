 class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {1,9,2,3,4};
        Selection(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Selection(int arr[]){
        int n =arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j =i+1;j<n;j++){
               if(arr[j] < arr[min]){
                min = j;
               }
            }
           int temp = arr[i];
           arr[i] =arr[min];
           arr[min] =temp;
        }
    }
}
