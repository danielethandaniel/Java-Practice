package Java_20260508_basics;

public class Number {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 14, 16};
        System.out.println(countEven(arr));
    }

    public static int countEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        return count;

    }
}
