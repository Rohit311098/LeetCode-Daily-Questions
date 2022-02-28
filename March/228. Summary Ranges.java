class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length==0)
        {
            return new ArrayList<>();
        }
        List<String> ans=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            int start=nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1])
            {
                i++;
            }
            
            if(start!=nums[i])
            {
                ans.add(""+start+"->"+nums[i]);
            }
            else
            {
                ans.add(""+start);
            }
        }
        return ans;
    }
}
