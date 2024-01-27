package djh.learn.sortingAlgorithms;

public class ShellSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {34,23,24,54,17,04,60,41,86,12};
        System.out.println("Before sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        //O(n^3/2) sorting algorithm
        for(int gap=arr.length/2;gap>0;gap/=2){
            System.out.print("gap is: "+gap+"\n");
            for (int i = gap; i<arr.length; i++) {
                int newElement=arr[i];
                 int j = i;
                System.out.print("newElement: "+newElement);
                while(j>=gap && arr[j-gap] > newElement){
                    arr[j] = arr[j-gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
        }
        System.out.println("After sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

}
