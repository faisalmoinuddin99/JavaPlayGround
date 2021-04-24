public class PairSum {
    public static void main(String[] args) {
        int[] a = {8, 7, 2, 5, 3, 1} ;
        int output = 10;
        int sum = 0 ;

        for(int i = 0; i<a.length - 1; i++){
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] + a[j] == output) {
                    System.out.println("Pair found (" + a[i] + ", " + a[j] + ")");
                }
            }
        }


        System.out.println("Pair not found.");
    }
}
