package Java_20260508_basics;

public class Array {

    static int[] numbers = {3, 7, 9, 12, 20};

    public static void main(String[] args) {
        printArray(numbers);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
