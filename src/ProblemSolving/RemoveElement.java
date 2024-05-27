package ProblemSolving;

public class RemoveElement {
    public int RemoveElement(int[] nums, int val){
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }


    public static void main(String[] args) {
        RemoveElement n = new RemoveElement();
        int [] nums = new int[]{1,2,3,5,16,5,4,5,9,5};
        int k = n.RemoveElement(nums,5);
        System.out.println(k);
    }
}
