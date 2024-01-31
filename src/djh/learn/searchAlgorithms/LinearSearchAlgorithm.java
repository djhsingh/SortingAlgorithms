package djh.learn.searchAlgorithms;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {34,23,24,54,17,04,60,41,86,12};
        System.out.println("Finding 17 in Array....");
        int element=17;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== element){
                System.out.println("Element Found at index no. "+i);
            }
        }
    }
}
