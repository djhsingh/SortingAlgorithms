package djh.learn.sortingAlgorithms;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {34,23,24,54,17,04,60,41,86,12};
        System.out.println("Before sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        //O(n^2) sorting algorithm
        for(int firstUnsortedIndex=1;firstUnsortedIndex<arr.length;firstUnsortedIndex++){ //O(n)
            //*
            int newElement=arr[firstUnsortedIndex];
            System.out.print("newElement is: "+newElement);
            System.out.print(" firstUnsortedIndex is: "+firstUnsortedIndex+"\n");
            int i;
            for (i = firstUnsortedIndex; i> 0 && arr[i-1] > newElement; i--) {  //O(n)
                 arr[i] = arr[i-1];
                System.out.print("arr["+i+"]="+arr[i]);
                System.out.print(" arr["+i+"-1]="+arr[i-1]);
            }
            arr[i] = newElement;
            System.out.print(" louter loop arr["+i+"]="+arr[i]+"\n");
        }
        System.out.println("After sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

}
