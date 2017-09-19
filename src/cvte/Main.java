package cvte;

import java.util.LinkedList;
import java.util.Scanner;

/*
约瑟夫环问题，输入为n，m，n代表链表长度，m代表每次报的最大数
 */
public class Main {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//
//        Node root = null;
//        Node next = null;
//        for (int i = 1; i <=n ; i++) {
//            if (root == null) {
//                root = new Node(i);
//                next=root;
//            }else {
//                next.next=new Node(i);
//                next=next.next;
//            }
//        }
//        next.next=root;
//
//        int i;
//        int count=0;
//        Node pre = null;
//        int[] out=new int[n];
//
//        pre=next;
//        while (count < n) {
//            i=1;
//            while (i < m) {
//                pre=pre.next;
//                root=root.next;
//                i++;
//            }
//            out[count]=root.v;
//
//            pre.next=root.next;
//            root=root.next;
//            count++;
//        }
//
//        for (int j = 0; j < n; j++) {
//            System.out.print(out[j]+" ");
//        }
        while (true) {
            test();
        }
    }
   static class Node{
        int v;
        Node next;

        public Node(int v) {
            this.v = v;
        }
    }
    static void test() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int i=0;
        int count=0;
        int[] out = new int[n];

        while (count < n) {
            i+=m-1;
            if (i >= list.size()) {
                i = i % list.size();
            }
            out[count++]=list.get(i);
            list.remove(i);
        }

        for (int j = 0; j < n; j++) {
            System.out.print(out[j]+" ");
        }
    }
}
