package djh.learn.sortingAlgorithms;

public class SelectionSortAlgorithmDescendingOrder2 {
    public static void main(String[] args) {
        int[] arr = {34,23,24,54,17,04,60,41,86,12};
        System.out.println("Before sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        //O(n^2) sorting algorithm
        for(int j=0;j<arr.length-1;j++){ //O(n)
            //*
            int smallest=j;
            for (int i = j+1; i < arr.length; i++) {  //O(n)
                 if(arr[smallest] < arr[i]){
                     smallest=i;

                 }

            }
            swap(arr,smallest,j);
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
