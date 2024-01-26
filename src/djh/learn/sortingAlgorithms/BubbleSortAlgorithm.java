package djh.learn.sortingAlgorithms;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {34,23,24,54,17,04,60,41,86,12};
        for (int i : arr) {
            System.out.println(i);
        }
        //O(n^2) sorting algorithm
        for(int lastUnsortedIndex=arr.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){ //O(n)
            //*
            for (int i = 0; i < lastUnsortedIndex; i++) {  //O(n)
                 if(arr[i] > arr[i+1]){
                     swap(arr,i,i+1);
                 }
            }
        }
        System.out.println("After sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void swap(int[] array,int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
