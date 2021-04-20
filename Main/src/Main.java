public class Main {
    public static void main(String[] args) {
       /* Method 1: Using Sum method
        int[] arr = {1,2,4,5};
        int n = arr.length + 1;
//        System.out.println(n);
        int Sn = ( n * (n + 1) ) / 2 ;
       // System.out.println(Sn);
        int sumOfArray = 0;
        for(int i = 0; i < arr.length ; i++){
            sumOfArray += arr[i];
        }
       // System.out.println("Sum of array " + sumOfArray);
        int findMissingNumber = Sn - sumOfArray ;
        System.out.println("Missing number is : " + findMissingNumber);

        */

        // Method 2: using XOR method
        int [] arr = {1,2,3,4,7,6,9,8,10};
        int xor1 = arr[0];
        for (int i = 1; i < arr.length; i++){
            xor1 = xor1 ^ arr[i] ;
        }
        int xor2 = 1;
        for(int i = 2; i<=10; i++){
            xor2 = xor2 ^ i;
        }

        System.out.println(xor1 ^ xor2);

    }
}