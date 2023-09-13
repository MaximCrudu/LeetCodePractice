package arrays;

/**
 * Time complexity O(n)
 *
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 *
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 *
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * Custom Judge:
 *
 * The judge will test your solution with the following code:
 *
 * int[] nums = [...]; // Input array
 * int[] expectedNums = [...]; // The expected answer with correct length
 *
 * int k = removeDuplicates(nums); // Calls your implementation
 *
 * assert k == expectedNums.length;
 * for (int i = 0; i < k; i++) {
 *     assert nums[i] == expectedNums[i];
 * }
 * If all assertions pass, then your solution will be accepted.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * Example 2:
 *
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * */
public class RemoveDuplicates {

    public static void callMethod() {

//        int[] nums = {3, 2, 2, 3};
//        int val = 3;

//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        int k = removeDuplicates(nums);

//        int[] nums2 = {0,0,1,1,1,1,2,3,3};
//        int k2 = removeDuplicates2(nums2);
//
//        int[] nums2 = {1,1,1,2,2,3};
//        int k2 = removeDuplicates2(nums2);

//        int[] nums2 = {1};
//        int k2 = removeDuplicates2(nums2);

//        int[] nums2 = {1,2};
//        int k2 = removeDuplicates2(nums2);

        int[] nums2 = {1,2,2};
        int k2 = removeDuplicates2(nums2);

//        int[] nums2 = {1,1,2,2,2,3};
//        int k2 = removeDuplicates2(nums2);

        System.out.println();
        System.out.println("k -> "+k2);
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        printRes(nums);

        return i+1;
    }

    public static int removeDuplicates2(int[] nums) {
        if (nums.length < 2)
            return 1;
        int i = 1;
        for(int j = 2; j < nums.length; j++){
            System.out.println("boucle");
            if(nums[j] != nums[i - 1]){
                nums[i + 1] = nums[j];
                i++;
            }
        }
        printRes(nums);

        return i+1;
    }

    private static void printRes(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println();
    }
}
