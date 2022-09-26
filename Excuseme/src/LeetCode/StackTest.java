package LeetCode;

import java.util.LinkedList;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
//        LinkedList<Integer> stack = new LinkedList<>();
//
//        stack.push(1);
//        stack.push(2);
//        for(int i =0;i<=2;i++){
//            System.out.println(stack.pop());
//        }

        Stack<String> s = new Stack();
        s.push("张扬");
        boolean flag = s.empty();

        if(flag){
            System.out.println("新建的栈是空的");
        }else{
            System.out.println("新建的栈有内容");
        }

    }
}
