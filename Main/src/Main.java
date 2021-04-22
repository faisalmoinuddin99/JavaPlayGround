class MergeSortImpl implements MergeSort {

    @Override
    public void merge(int[] A, int left, int mid, int right) {
        int i, j, k ;
        int[] B = new int[100] ;
        i = left;
        j = mid + 1;
        k = left;

        while (i <= mid && j <= right)
        {
            if (A[i] < A[j])
            {
                B[k] = A[i];
                i++;
                k++;
            }
            else
            {
                B[k] = A[j];
                j++;
                k++;
            }
        }
        while (i <= mid)
        {
            B[k] = A[i];
            k++;
            i++;
        }
        while (j <= right)
        {
            B[k] = A[j];
            k++;
            j++;
        }
        for ( i = left; i <= right; i++)
        {
            A[i] = B[i];
        }

    }


    @Override
    public void sort(int[] a, int left, int right) {
        if(left < right){
            // find the middle point
            int mid = left + (right - left) / 2 ;

            // Sort first and second halves
            sort(a,left, mid) ;
            sort(a, mid + 1, right);

            // Merge the sorted Halves
            merge(a,left, mid, right);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {6,8,1,0,5,10} ;
        int len = arr.length ;
        System.out.println("Print Array before sorting: ");
        printArray(arr) ;
        MergeSortImpl msi = new MergeSortImpl();

        msi.sort(arr,0, arr.length - 1);

        System.out.println();
        System.out.println("Print Array after sorting: ");
        printArray(arr) ;
    }
    public static int[] printArray(int[] a){
        for(int i : a) {
            System.out.print(i + " ");
        }
        return a ;
    }
}