package programmingLogic;

import java.util.*;

public class AssertionTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int one = Integer.parseInt(s.nextLine());
        System.out.print("Enter second number: ");
        int two = Integer.parseInt(s.nextLine());

        //2147483647 is biggest int value

        int answer = plus(one, two);
        assert(answer == one+two);

        int[] nums = {1,2,3,4};
        swap(nums, 0, 5);

        System.out.println("\nSwapped:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    /**
     * Returns the sum of two whole numbers
     *
     * @param a - the first number
     * @param b - the second number
     *            requires a + b <= Integer.MAX_VALUE
     * @return the sum of a and b
     */
    public static int plus(int a, int b) {
        assert(b != 0);

        return a/b;
    }

    /**
     * Swaps two elements in an array
     *
     * <h4>Precondition:</h4>
     * {@code
     * 0 <= pos1 < arr.length and 0 <= pos2 < arr.length
     * }
     *
     * <h4>Postcondition:</h4>
     *      <pre>
     *      {@code
     *      arr[pos1] == arr_in[pos2]
     *      arr[pos2] == arr_in[pos1]
     *      For all positions i, if i != pos1 and i != pos2,
     *          then arr[i] == arr_in[i]
     *      }
     *      </pre>
     *
     * @param arr - an integer array
     * @param pos1 - the first position to swap
     * @param pos2 - the second position to swap
     */
    public static void swap(int[] arr, int pos1, int pos2) {
        assert(pos1 >= 0 && pos1 < arr.length);
        assert(pos2 >= 0 && pos2 < arr.length);

        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}