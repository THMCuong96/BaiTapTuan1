package Tuan1;

import java.util.Arrays;
public class Baitaptuan2 {
    public static void sort(int[] array, String order) {
        if (!order.equals("ascending") && !order.equals("descending")) {
            System.out.println("Invalid selection");
            return;
        }
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && ((order.equals("ascending") && current < array[j]) || (order.equals("descending") && current > array[j]))) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] soTangdan = {1, 6, 4, 9, 8, 2};
        sort(soTangdan, "ascending");
        System.out.println(Arrays.toString(soTangdan)); // In ra: "[1, 2, 4, 6, 8, 9]"
    }
}