class Solution {
      public static int sum = 0;
    public static void pathSum(Node root,int num){
        if(root==null) return;
        if(root.left==null && root.right==null){
            num = num*10+root.data;
            sum += num;
            return;
        }
        num = num*10+root.data;
        pathSum(root.left,num);
        pathSum(root.right,num);
    }
    public static int treePathsSum(Node root) {
        sum = 0;
        pathSum(root,0);
        return sum;
    }
}
