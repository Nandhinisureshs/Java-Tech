package Strings;

import java.util.Arrays;

public class Found_element {

    boolean linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target)
                return true;
        }
        return false;
    }

    boolean binarySearch(int[] array, int target) {

        // step 1: sorting
        Arrays.sort(array);

        int left = 0, right = array.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (array[mid] == target)
                return true;

            if (target > array[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
    }
}