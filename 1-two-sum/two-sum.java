// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int start=0;
//         int end=nums.length-1;
//         while(start<end){
//             if(nums[start]+nums[end]==target){
//                 return new int[]{start,end};
//             }
//             else if((nums[start]+nums[end])<target){
//                 start++;
//             }
//             else{
//                 end--;
//             }
//         }
//         return new int[0];
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]== target)
                {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}