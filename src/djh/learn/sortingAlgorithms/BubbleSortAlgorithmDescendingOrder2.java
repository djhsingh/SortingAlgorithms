package djh.learn.sortingAlgorithms;

public class BubbleSortAlgorithmDescendingOrder2 {
    public static void main(String[] args) {
        //forward loop
        int[] arr = {34,23,24,54,17,04,60,41,86,12};
        System.out.println("Before sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        //O(n^2) sorting algorithm
        for(int j = 0;j<arr.length-1;j++){ //O(n)
            //*
            for (int i = 0; i < arr.length - j -1; i++) {  //O(n)
                 if(arr[i] < arr[i+1]){
                     swap(arr,i,i+1);
                 }
           }
        }
        System.out.println("After sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void swap(int[] arr,int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
