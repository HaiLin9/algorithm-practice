package leetcode;

/**
 * ����һ��������������ÿ����㶼���һ��?0-9?�����֣�ÿ���Ӹ���Ҷ�ӽڵ��·��������һ�����֡�
 *
 * ���磬�Ӹ���Ҷ�ӽڵ�·�� 1->2->3 �������� 123��
 *
 * ����Ӹ���Ҷ�ӽڵ����ɵ���������֮�͡�
 *
 * ˵��:?Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣
 *
 * ʾ�� 1:
 *
 * ����: [1,2,3]
 *     1
 *    / \
 *   2   3
 * ���: 25
 * ����:
 * �Ӹ���Ҷ�ӽڵ�·�� 1->2 �������� 12.
 * �Ӹ���Ҷ�ӽڵ�·�� 1->3 �������� 13.
 * ��ˣ������ܺ� = 12 + 13 = 25.
 * ʾ�� 2:
 *
 * ����: [4,9,0,5,1]
 *     4
 *    / \
 *   9   0
 * ?/ \
 * 5   1
 * ���: 1026
 * ����:
 * �Ӹ���Ҷ�ӽڵ�·�� 4->9->5 �������� 495.
 * �Ӹ���Ҷ�ӽڵ�·�� 4->9->1 �������� 491.
 * �Ӹ���Ҷ�ӽڵ�·�� 4->0 �������� 40.
 * ��ˣ������ܺ� = 495 + 491 + 40 = 1026.
 *
 * ��Դ�����ۣ�LeetCode��
 * ���ӣ�https://leetcode-cn.com/problems/sum-root-to-leaf-numbers
 * ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 */
public class LeetCode129 {
    int sum = 0;

    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }


    public int sumNumbers(TreeNode root) {
        sumNumber(root,0);
        return sum;
    }

    public void sumNumber(TreeNode root, int temp) {
        if(root==null) {
            return;
        }
        int cur = temp * 10 + root.val;
        if(root.left==null && root.right==null) {
            sum+=cur;
        }
        if(root.left !=null){
            sumNumber(root.left, cur);
        }
        if(root.right!=null){
            sumNumber(root.right,cur);
        }
    }
}