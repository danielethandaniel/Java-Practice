package Java_20260508_basics;

public class Array2 {
    public static int[] filterEven(int[] arr) {


        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        int[] arr2 = new int[count];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr2[index++] = arr[i];
            }
        }

        return arr2;
    }

}
