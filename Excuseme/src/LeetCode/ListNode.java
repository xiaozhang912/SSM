package LeetCode;

/**
 * 节点
 */
public class ListNode {

    public static void main(String[] args) {
        listNode n1 = new listNode(4);
        listNode n2 = new listNode(2);
        listNode n3 = new listNode(1);

        n1.next = n2;
        n2.next = n3;


    }
    static class listNode{
        int val;
        listNode next;
        listNode(int x) {
            val = x;
        }
    }

}
