import java.util.HashSet;
import java.util.Set;

public class Leetcode3 {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        int answer = solution.lengthOfLongestSubstring("pwwkew");
        System.out.println(answer);

//        String text ="abcabcbb";
//        System.out.println(text.charAt(1));

    }
}


class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Set<String> set=new HashSet<>();
        int left =0;
        int ans=0;

        for(int i=0;i<s.length();i++){

            if(set.contains(String.valueOf(s.charAt(i)))){
                set.remove(String.valueOf(s.charAt(left)));
                left+=1;

            }
            set.add(String.valueOf(s.charAt(i)));
            ans=Math.max(ans,i-left+1);

        }

    return ans;
    }
}
