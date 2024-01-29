package djh.learn.sortingAlgorithms;

public class BubbleSortAlgorithmDescendingOrder {
    public static void main(String[] args) {
        int[] arr = {34, 23, 24, 54, 17, 04, 60, 41, 86, 12};
        //backword loop
        System.out.println("Before sorting...");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        //O(n^2) sorting algorithm
        for(int lastSortedIndex = arr.length-1;lastSortedIndex>0;lastSortedIndex--){
            for (int i = 0; i < lastSortedIndex; i++) {
                if(arr[lastSortedIndex] > arr[i]){
                    swap(arr,lastSortedIndex,i);
                }
            }
        }
        System.out.println("After sorting...");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}
