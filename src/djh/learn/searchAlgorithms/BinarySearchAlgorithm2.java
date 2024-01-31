package djh.learn.searchAlgorithms;

public class BinarySearchAlgorithm2 {
    public static void main(String[] args) {
        int[] arr = {4 ,12, 17, 23, 24, 34, 41, 54, 60, 86};
        System.out.println("Finding 17 in Array....");

        int ele = binarySearchAlgo(arr,0,arr.length,17);
        System.out.println(ele);
    }

    private static int binarySearchAlgo(int[] arr,int start,int end,int element) {

        while(start< end){
            int midPoint = (end+start)/2;
            if(element == arr[midPoint]){
                return midPoint;
            }
            else if(element < arr[midPoint]){
                end = midPoint-1;
            }
            else if(element > arr[midPoint]){
                start = midPoint+1;
            }
        }
        return -1;
    }
}
