
public class Solution {
	public void moveZeroes(int[] nums) {
        int i = 0;
        int numsZero = 0;
        for(int j = 0; j < nums.length; j++){
        	if(nums[j] != 0){
        		nums[i] = nums[j];
        		i++;
        	}else{
        		numsZero++;
        	}
        }
        
        for(int j = nums.length - 1; j >= nums.length - numsZero; j--){
        	nums[j] = 0;
        }
    }
}
