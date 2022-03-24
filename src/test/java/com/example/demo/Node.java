package com.example.demo;

/**
 * @author liangxu
 * @version 1.0
 * @description
 * @date 2022-03-23 15:20:56
 **/
public class Node {

    int val;
    Node next;
    Node random;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    Node(int val, Node next, Node random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }
}
