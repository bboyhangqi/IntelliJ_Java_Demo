package com.company.interview;

/**
 * Created by zhaomingming-s on 2017/8/30.
 */
public class DoubleLinkedList {

    Node first;

    Node end;

    class Node {

        public Node next;
        public Node last;
        String data;

    }


    public void addNext(int index, String data) {

        if (first == null) {
            Node n = new Node();
            n.data = data;
            first = n;
            end = n;
        } else {
            Node curN = first;
            int position = 0;
            while (curN != null) {
                if (position == index) {
                    Node n = new Node();
                    n.data = data;
                    n.next = curN.next;
                    n.last = curN;
                    n.last.next = n;
                    if (n.next != null) {
                        n.next.last = n;
                    } else {
                        end = n;
                    }
                    return;
                }
                curN = curN.next;
                position++;
            }
        }

    }

    public void addPrevious(int index, String data) {
        if (first == null) {
            Node n = new Node();
            n.data = data;
            first = n;
            end = n;
        } else {
            int position = 0;
            Node curN = first;
            while (curN != null) {
                if (position == index) {
                    Node n = new Node();
                    n.data = data;
                    n.last = curN.last;
                    n.next = curN;
                    curN.last = n;
                    if (n.last != null)
                        n.last.next = n;
                    else {
                        first = n;
                    }
                    return;
                }
                position++;
                curN = curN.next;
            }
        }

    }

    public void addToFirst(String data) {
        Node n = new Node();
        n.data = data;
        if (first == null) {
            first = n;
            end = n;
        } else {
            n.next = first;
            first.last = n;
            first = n;
        }
    }

    public void addToEnd(String data) {
        Node n = new Node();
        n.data = data;
        if (first == null) {
            first = n;
            end = n;
        } else {
            n.last = end;
            end.next = n;
            end = n;
        }
    }

    public void deleteByPos(int index) {
        Node curN = first;
        int position = 0;
        while (curN != null) {
            if (position == index) {
                curN.last.next = curN.next;
                curN.next.last = curN.last;
                return;
            }
            position++;
            curN = curN.next;
        }


    }


    public Node getMiddle() {
        Node n1 = first;
        Node n2 = first;
        int index = 0 ;
        while (n2 != null) {
            if(n2.next==null||n2.next.next==null)
                break;
            index ++;
            n2 = n2.next.next;
            n1 = n1.next;
        }
        System.out.println("middle data: " + n1.data);
        System.out.println("middle index: " + index);
        return n1;
    }


    public void showAll() {
        Node n = first;
        while (n != null) {
            System.out.println("data: " + n.data);
            n = n.next;
        }


    }

    public static void main(String[] args) {
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.addNext(0, "0");
        linkedList.addNext(0, "1");
        linkedList.addNext(0, "2");
        linkedList.addNext(0, "3");
 //       linkedList.addPrevious(0, "1");
//        linkedList.addPrevious(0, "2");
//        linkedList.addPrevious(0, "3");
//        linkedList.addToFirst("100");
//        linkedList.addToFirst("100");
//        linkedList.addToFirst("100");
//        linkedList.addToFirst("100");
//        linkedList.addToEnd("200");
//        linkedList.addToEnd("200");
//        linkedList.addToEnd("200");
//        linkedList.addToEnd("200");
//        linkedList.showAll();
//
//
//        linkedList.deleteByPos(4);
//        linkedList.deleteByPos(4);
//        linkedList.deleteByPos(4);
        linkedList.showAll();

        linkedList.getMiddle();
    }


}