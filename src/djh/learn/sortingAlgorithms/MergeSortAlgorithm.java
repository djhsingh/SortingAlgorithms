package djh.learn.sortingAlgorithms;


public class MergeSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {34,23,24,54,17,04,60,41,86,12};
        System.out.println("Before sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        //O(n^2) sorting algorithm
        System.out.println("After sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if(end - start <2){
            return;
        }
        int midPoint = (start+end)/2;
        mergeSort(arr,midPoint+1,end);
        merge(arr,start,midPoint,end);
    }

    private static void merge(int[] arr, int start, int midPoint, int end) {
        if(arr[midPoint-1] <= arr[midPoint]){
            return;
        }
        int i = start;
        int j = midPoint;
        int tempIndex = 0;
        int[] temp = new int[end-start];
        while(i < midPoint && j < end){
            temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++]:arr[j++];
        }

    }


}
