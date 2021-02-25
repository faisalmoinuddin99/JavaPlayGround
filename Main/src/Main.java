import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] a = {};
        a = add(a);
        a = add(a);
        a = add(a);
        a = add(a);

        System.out.println("Traversing the array :");
        for (int i : a) {
            System.out.print(i + " ");
        }

        System.out.println("Traversing the array :");
        display(a);
        int data = indexDeletion(a);
        System.out.println("deleted element " + data);
        Scanner sc = new Scanner(System.in);

        int[] issueBook = {};

       int [] result = removeTheElement(a,2);
        System.out.println("result");
       display(result);
    }

    public static int[] add(int[] a) {
        int[] array = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i];
        }
        System.out.println("Enter the element:");
        Scanner sc = new Scanner(System.in);
        array[array.length - 1] = sc.nextInt();

        return array;
    }

    public static int indexDeletion(int[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element which want to delete :");
        int j = sc.nextInt();
        for (int i = 0, k = 0; i < a.length; i++) {
            if (a[i] != j) {
                a[k++] = a[i];
            }
        }
        return j;

    }

    public static void display(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static int[] removeTheElement(int[] arr,
                                         int index) {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }

        // return the resultant array
        return IntStream.range(0, arr.length)
                .filter(i -> i != index)
                .map(i -> arr[i])
                .toArray();
    }
}