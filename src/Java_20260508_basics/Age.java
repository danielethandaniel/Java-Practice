package Java_20260508_basics;

public class Age {

    public static void main(String[] args) {

//        int arr[]= new int[]{10, 18, 25};
        int arr[] = {10, 18, 25};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(checkAge(arr[i]));
        }
    }

    public static String checkAge(int age) {
        if (age >= 18) {
            return "成年";
        } else {
            return "未成年";
        }
    }
}
