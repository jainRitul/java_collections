class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {10,3,2,5};
        
        linearSearch(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void linearSearch(int  arr[]){

        for(int i=0;i<arr.length-1;i++){
            boolean swapped = false;
            for(int j = 0;j<arr.length-i-1;j++){
               if(arr[j] > arr[j+1]){
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1]= temp;
                 swapped = true;
               }

            }
            if(swapped == false)
            break;
      /*   
      for(int i=0;i<arr.length-1;i++){
       for(int j = i+1;j<arr.length;j++){
          if(arr[i] > arr[j]){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
          }
       }
      }*/
    
    }
  }
}
