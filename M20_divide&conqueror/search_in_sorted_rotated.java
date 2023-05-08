public class search_in_sorted_rotated {
    public static int search(int[] nums, int target) 
    {
        int si = 0;
        int ei = nums.length-1;
        while(si<=ei)
        {
            int mid = si +(ei - si)/2;
            // case found
            if(nums[mid] == target)
            {
                return mid;
            }
            // mid on L1
            if(nums[si] <= nums[mid])
            {
                // case a: left
                if(nums[si] <= target && target <= nums[mid])
                {
                    ei = mid - 1;
                }
                // case b : right
                else
                {
                    si = mid + 1;
                }
            }
            // mid on L2
            else
            {
                // case c: right
                if(nums[mid] <= target && target <= nums[ei])
                {
                    si = mid + 1;
                }
                else
                {
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        int tarIdx = search(nums,target);
        System.out.println(tarIdx);

    }
}

// output 4
