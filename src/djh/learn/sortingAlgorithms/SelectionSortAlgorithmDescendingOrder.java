package djh.learn.sortingAlgorithms;

public class SelectionSortAlgorithmDescendingOrder {
    public static void main(String[] args) {
        int[] arr = {34,23,24,54,17,04,60,41,86,12};
        System.out.println("Before sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        //O(n^2) sorting algorithm
        for (int lastUnSortedIndex=arr.length-1;lastUnSortedIndex>0;lastUnSortedIndex--){
            int smallest = 0;
            for (int i = 0; i <= lastUnSortedIndex; i++) {
                if(arr[smallest] > arr[i]){
                    smallest=i;
                }
            }
            swap(arr,smallest,lastUnSortedIndex);
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
