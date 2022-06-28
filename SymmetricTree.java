package com.leetcode;

import javax.swing.tree.TreeNode;

public class SymmetricTree {
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return helper(root.left,root.right);
        }

        private static boolean helper(TreeNode root1,TreeNode root2){
            if(root1==null || root2 ==null) return root1==root2;
            return root1.val==root2.val && helper(root1.left,root2.right) && helper(root1.right,root2.left);
        }
    }
}
