package djh.learn.sortingAlgorithms;

import java.util.Arrays;

public class CountingSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2,5,9,8,2,04,8,7,10,3};
        System.out.println("Before sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        //O(n^2) sorting algorithm
        countingSort(arr, Arrays.stream(arr).min().getAsInt(),Arrays.stream(arr).max().getAsInt());
        System.out.println("After sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void countingSort(int[] arr,int min,int max) {
        System.out.println(min+"---------"+max);
        int [] countArray = new int[(max-min)+1];
                for(int i=0;i<arr.length;i++){
                    countArray[arr[i]-min]+=1;
                }
        for (int i : countArray) {
            System.out.print(i+" ");
        }

        for(int i=min, j=0; i<=max;i++){
            while(countArray[i-min] >0){
                arr[j]=i;
                countArray[i-min]--;
                j++;
            }
        }

    }


}
