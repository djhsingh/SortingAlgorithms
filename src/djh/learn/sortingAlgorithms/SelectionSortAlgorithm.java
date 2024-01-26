package djh.learn.sortingAlgorithms;

public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {34,23,24,54,17,04,60,41,86,12};
        System.out.println("Before sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        //O(n^2) sorting algorithm
        for(int lastUnsortedIndex=arr.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){ //O(n)
            //*
            int largest=0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {  //O(n)
                 if(arr[largest] < arr[i]){
                     largest=i;

                 }

            }
            swap(arr,lastUnsortedIndex,largest);
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
