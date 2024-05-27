package ProblemSolving;

import java.util.Arrays;

public class RemoveDuplicates {
    public int removeDuplicated(int [] nums) {
        int j = 1;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i-1] != nums[j]) {
                nums[j]=nums[i];
                j++;
            }


        }
        return j;

        }





    public static void main(String[] args) {
        int [] array = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicates remover = new RemoveDuplicates();
        int k = remover.removeDuplicated(array);
        System.out.println(k);

    }
}


