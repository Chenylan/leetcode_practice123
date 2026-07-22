package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Leetcode22 {
    public static void main(String[] args) {
        List<String> strings = generateParenthesis(2);
        System.out.println(strings);


    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        char [] path=new char[n*2];
        dfs(ans,path,n,0,0);
        return ans;

    }

    public static void dfs(List<String> ans,char [] path, int n ,int left, int right){
        if(right==n){
            ans.add(new String(path));
            return;
        }
        if(left<n){
            path[left+right]='(';
            dfs(ans,path,n,left+1,right);
        }
        if(right<left){
            path[left+right]=')';
            dfs(ans,path,n,left,right+1);
        }

    }
}
