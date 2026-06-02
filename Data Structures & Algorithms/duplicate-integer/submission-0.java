class Solution {
    public boolean hasDuplicate(int[] nums) {
        LinkedList<Integer> h=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(h.contains(nums[i])){
                return true;
            }
            h.add(nums[i]);
        } 
        return false;       
    }
}