class Solution {
    public boolean isGreater(int mid, int target, int[] nums)
    {
        if( nums[mid] >= target)
        {
            return true;
        }
        return false;
    }

    public int searchInsert(int[] nums, int target) {
        
        int left=0, right = nums.length -1;

        while(left<=right)
        {
            int mid = (left + right)/2;
            if(isGreater(mid, target, nums))
            {
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}