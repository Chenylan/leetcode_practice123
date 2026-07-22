public class Leetcode560 {
    public static void main(String[] args) {
        Solution560 solution=new Solution560();
        int ans = solution.subarraySum(new int[]{1}, 0);
        System.out.println(ans);

    }
}


class Solution560 {
    public int subarraySum(int[] nums, int k) {
        int ans=0;
        int sum=0;
        int left =0;
        for(int right =0;right<nums.length;right++){
            sum+=nums[right];
            if(sum==k){
                ans++;
            }
            while(sum>k){
                sum-=nums[left];
                left+=1;
            }

        }
        return ans;

    }
}