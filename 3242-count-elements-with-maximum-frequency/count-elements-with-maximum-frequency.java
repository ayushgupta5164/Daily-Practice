class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxFreq=0;
        int[] freq=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            freq[num]++;
            maxFreq=Math.max(maxFreq, freq[num]);
        }
        int sum=0;
        for(int i=0;i<=100;i++)
        {
            if(freq[i]==maxFreq)
            {
                sum+=maxFreq;
            }
        }
        return sum;
    }
}