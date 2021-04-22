public class CountSortImpl implements CountSort{

    @Override
    public void count(int[] a, int n) {
        int i;
        // Find the Maximum Element in Array
        int maximumElement = find_max_element(a,n) ;

        // Create an auxiliary array of maximum element + 1
        int [] countArray = new int[maximumElement + 1] ;

        // Increment the corresponding index in the countArray
        for( i = 0; i< n;i ++)
        {
            countArray[a[i]] = countArray[a[i]] + 1;
        }
        i = 0; // counter for count array
        int j = 0 ; // counter for given array 'a'

        while(i <= maximumElement) {
            if(countArray[i] > 0){
                a[j] = i;
                countArray[i] = countArray[i] - 1;
                j++ ;
            } else {
                i++;
            }
        }

    }

    private int find_max_element(int[] a, int n){
        int max = Integer.MIN_VALUE ;
        for(int i = 0; i < n; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max ;
    }
}

class DemoCountSort {
    public static void main(String[] args) {
        int[] a = {9,1,4,14,4,15,6} ;
        int sizeOfArray = a.length ;
        CountSortImpl csi = new CountSortImpl() ;
        printArray(a) ;
        System.out.println();
        csi.count(a,sizeOfArray);
        printArray(a) ;

    }

    public static int[] printArray(int[] a){
        for(int i : a){
            System.out.print(i + " ");
        }
        return a ;
    }
}
/*
TIME COMPLEXITY :
* O(m + n )
* ~ O(n) -> Linear Time but at the cost of extra space

 */