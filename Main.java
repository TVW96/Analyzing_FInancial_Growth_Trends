
import java.util.Arrays;

public class Main {

    public static int[] sortedSquares(int[] growthPercentages) {
        int n = growthPercentages.length;
        int[] result = new int[n];
        int left = 0, right = n - 1, pos = n - 1;

        while (left <= right) {
            if (Math.abs(growthPercentages[left]) > Math.abs(growthPercentages[right])) {
                result[pos--] = growthPercentages[left] * growthPercentages[left];
                left++;
            } else {
                result[pos--] = growthPercentages[right] * growthPercentages[right];
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[] example1 = {-5, -2, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(example1))); // Output: [0, 4, 9, 25, 100]

        // Example 2
        int[] example2 = {-8, -3, 2, 4, 12};
        System.out.println(Arrays.toString(sortedSquares(example2))); // Output: [4, 9, 16, 64, 144]
    }
}
