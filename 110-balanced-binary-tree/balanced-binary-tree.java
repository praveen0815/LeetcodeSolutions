class Solution {
    public boolean isBalanced(TreeNode root) {
        int h = getHeight(root);
        return (h == -1) ? false : true;
    }
    public int getHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int lh = getHeight(root.left);
        if(lh == -1) {
            return -1;
        }
        int rh = getHeight(root.right);
        if(rh == -1) {
            return -1;
        }
        if(Math.abs(lh - rh) > 1) {
            return -1;
        }
        return Math.max(lh, rh) + 1;
    }
}