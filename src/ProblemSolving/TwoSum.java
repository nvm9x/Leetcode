package ProblemSolving;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        int[] array = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    array[0]=nums[i];
                    array[1]=nums[j];
                }

            }

        }
        return array;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{2,5,6,8}, 7)));
    }
}
