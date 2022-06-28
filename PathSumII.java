package com.leetcode;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    class Solution {
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> ans =new ArrayList<>();

            if(root==null){
                return ans;
            }

            helper(root,targetSum,ans,new ArrayList<Integer>());

            return ans;
        }

        public void helper(TreeNode root, int target,List<List<Integer>> ans,List<Integer> curr){

            if(root.left==null && root.right==null){
                if(target==root.val){
                    curr.add(root.val);
                    ans.add(new ArrayList(curr));
                    curr.remove(curr.size()-1);
                    return;
                }

                return;
            }

            curr.add(root.val);
            target-=root.val;
            if(root.left!=null){
                helper(root.left,target,ans,curr);
            }
            if(root.right!=null){
                helper(root.right,target,ans,curr);
            }


            target+=curr.get(curr.size()-1);
            curr.remove(curr.size()-1);

            return;
        }
    }
}
