package dataStructures;

import java.util.ArrayList;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) { this.val = val; this.next = next;}

    public ArrayList<Integer> toArray() {
        ListNode p = this;
        ArrayList<Integer> array = new ArrayList<>();
        while (p != null) {
            array.add(p.val);
            p = p.next;
        }
        return array;
    }

    public String toString() {
        ListNode p = this;
        if (p == null) return "";

        String listString = "";
        while (p != null) {
            listString = listString + p.val + "->";
            p = p.next;
        }
        listString += "null";
        return listString;
    }

    public void print() {
        System.out.println(toString());
    }

    public static ListNode toListNode(ArrayList<Integer> array) {
        ListNode head = new ListNode();
        ListNode tail = head;

        for (int v:array) {
            tail.next = new ListNode(v);
            tail = tail.next;
        }
        tail.next = null;
        return head.next;
    }

    public static ListNode toListNode(int[] array) {
        ListNode head = new ListNode();
        ListNode tail = head;

        for (int v:array) {
            tail.next = new ListNode(v);
            tail = tail.next;
        }
        tail.next = null;
        return head.next;
    }
}