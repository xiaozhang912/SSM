package LeetCode;

import java.util.HashMap;
import java.util.Map;

/*
    数据结构-----树和散列表
 */
public class Tree {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(6);
        TreeNode n5 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;

        //散列表--Map
        Map<String,Integer> dic = new HashMap<>();

        dic.put("小张",10001);
        dic.put("小锅",10002);

        System.out.println(dic.get("小锅"));
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}
