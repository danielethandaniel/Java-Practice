package Java_20260509_DynamicArray;


public class DynamicArray {
    public static void main(String[] args) {
        Array(5);
        for (int num : Array(5)) {
            System.out.println(num);
        }
    }

    public static int[] Array(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[n - 5 + i] = i;
        }
        return arr;
    }
}



