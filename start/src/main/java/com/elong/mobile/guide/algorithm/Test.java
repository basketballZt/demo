package com.elong.mobile.guide.algorithm;

public class Test {
	public static void main(String[] args) {

	}

	public int singleNumber(int[] A) {
		if (A == null || A.length <= 0)
			return -1;
		int temp = A[0];
		for (int i = 1; i < A.length; i++) {
			temp ^= A[i];
		}
		return temp;
	}
   //二叉树最大长度
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		int leftLen = maxDepth(root.left);
		int rightLen = maxDepth(root.right);
		return leftLen>=rightLen?leftLen+1:rightLen+1;
	}
	//二叉树是否相似
	 public boolean isSameTree(TreeNode p, TreeNode q) {
	        if(p==null&&q==null)return true;
	        if(p!=null&&q!=null){
	        	if(p.val!=q.val){
	        		return false;
	        	}
	        return 	isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
	        }
	        return false;
	   }
}
