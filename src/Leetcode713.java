public class Leetcode713 {

    public static void main(String[] args) {
        Solution713 solution=new Solution713();
        int ans = solution.numSubarrayProductLessThanK(new int[]{10,5,2,6},100);
        System.out.println(ans);


    }

}

class Solution713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int prod=1;
        int ans=0;
        int left =0;
        for(int i =0; i<nums.length;i++){
            prod*=nums[i];
            while (prod>=k){
                prod=prod/nums[left];
                left+=1;

            }
            ans+=(i-left+1);

        }
        return ans;


    }
}
