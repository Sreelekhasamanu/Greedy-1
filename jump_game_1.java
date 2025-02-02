//TC: O(n)
//SC: O(1)

class Solution {
    public boolean canJump(int[] nums) {
        int reach = 0;
        for(int i=0;i<=reach;i++){
            reach= Math.max(reach , i+nums[i]);
            if(reach>=nums.length-1){
                return true;
            }
        }
        return false;
        
    }
}