import java.util.*;
import java.io.*;
import java.lang.*;
class chocolateDistribution {
    public static void main(String[] args){
        int arr[] = {4,2,7,10,9};
        int m = 3;
        System.out.println(chocolateDistributionSol(arr,m));
    }
    static int chocolateDistributionSol(int arr[],int m){
        if(m > arr.length)
        return Integer.MAX_VALUE;
        Arrays.sort(arr);
        int res = arr[m-1] - arr[0];
        for(int  i =1 ; (i+m-1) < arr.length ; i++){
            res = Math.min(res,arr[i+m-1] - arr[i]);
        }
        return res;
    }

}
