package java_20260921_hashmap;

import java.util.ArrayList;
import java.util.Random;

public class hashmap_demo2 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};

        ArrayList list = new ArrayList();

        Random random = new Random();

        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(arr.length);
            list.add(arr[index]);
        }
    }
}
