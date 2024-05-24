package ProblemSolving;

import java.util.Arrays;

public class RemoveDuplicates {
    public int removeDuplicated(int [] nums){
        int k=0;
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=1;i<nums.length-1;i++) {
            for (int j = 1 + i; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    i = j - 1;
                    break;

                }

            }
            k++;
        }

        return k;

    }

    public static void main(String[] args) {
        int [] array = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicates remover = new RemoveDuplicates();
        int k = remover.removeDuplicated(array);
        System.out.println(k);

    }
}


