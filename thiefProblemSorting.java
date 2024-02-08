import java.util.*;
import java.io.*;
import java.lang.*;

class thiefProblemSorting {
   public static void main(String[] args) {

     Integer arr[] = {2,4,299,5,8,3,2,6,3,99,55,53,57,76};
     int k = 3;
     System.out.println(maxAmountTheifCanCollect(arr,k));
     //solve these question using priority queue
     System.out.println(maxAmountTheifCanCollectByPriorityQueue(arr, k));
   }
    static int  maxAmountTheifCanCollectByPriorityQueue(Integer arr[],int k){
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i] > pq.peek() ){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        int sum =0;
        for(Integer x : pq){
           sum += x;
        }
        return sum;

        

    }
    static int maxAmountTheifCanCollect(Integer arr[],int k){
        Arrays.sort(arr,Collections.reverseOrder());
        int ans = 0;
        for(int i=0;i<k;i++){
        ans += arr[i];
        }
        return ans;

   }

}
