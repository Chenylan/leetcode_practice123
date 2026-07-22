import java.util.List;
import java.util.ArrayList;

public class Leetcode46 {
    public static void main(String[] args) {
        Leetcode46 solution=new Leetcode46();
        solution.permute(new int[]{1,2,3});
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        backtracking(res,cur,nums);
        return res;

    }
    public static void backtracking(List<List<Integer>> res, List<Integer> cur, int[]nums){
        if(cur.size()==nums.length){
            res.add(new ArrayList<>(cur));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(!cur.contains(nums[i])){
                cur.add(nums[i]);
                backtracking(res,cur,nums);
                cur.remove(cur.size()-1);
            }
        }

    }
}
