package djh.learn.sortingAlgorithms;

public class QuickSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {34,23,24,54,17,04,60,41,86,12};
        System.out.println("Before sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        //O(n^2) sorting algorithm
        quickSort(arr,0,arr.length);
        System.out.println("After sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void quickSort(int[] arr,int start,int end){
        if(end-start <2){
            return;
        }
        int pivotIndex = partition(arr,start,end);
        quickSort(arr,start,pivotIndex);
        quickSort(arr,pivotIndex+1,end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivotElement = arr[start];
        int i = start;
        int j = end;
        while(i<j){
            while(i<j && arr[--j] >= pivotElement);
                if(i<j){
                    arr[i]=arr[j];
                }
            while(i<j && arr[++i] <= pivotElement);
                if(i<j){
                    arr[j]=arr[i];
                }

        }
        arr[j]=pivotElement;
        return j;
    }
}
