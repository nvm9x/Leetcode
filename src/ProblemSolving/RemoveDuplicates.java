package ProblemSolving;

public class RemoveDuplicates {
    public int removeDuplicated(int [] nums){
        int[] expectedNums=new int[nums.length];
        int k=0;
        for(int i =1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                expectedNums[k++] = nums[i];
            }
        }
        return k;

    }

    public static void main(String[] args) {
        int [] array = {1,2,2,3,5,6,8,8,7};
        RemoveDuplicates remover = new RemoveDuplicates();
        int k = remover.removeDuplicated(array);
        System.out.println(k);

    }
}


