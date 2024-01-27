package djh.learn.sortingAlgorithms;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int n= 4;
        int factorial = factorial(n);
        System.out.println("Factorial of "+n+" is: "+factorial);
    }

    private static int factorial(int n) {
        if(n==1 || n == 0){
            return 1;
        }

            return  n* factorial(n-1);
    }
}
