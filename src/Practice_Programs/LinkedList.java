/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_Programs;

/**
 *
 * @author meet
 */

//NOTE: It's sample program of linkedList not HackerRank Problem :)
class Node {

    Node next;
    int data;

    Node(int data) {
        this.data = data;
    }
}

public class LinkedList {

    Node head;

    //Append node at last
    public void appendNode(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    //Append node at front 
    public void prependNode(int data) {
        Node current = head;
        head = new Node(data);
        head.next = current;
    }

    //Delete node as per passed data
    public void deleteNode(int data) {
        Node current = head;
        if (current.data == data) {
            head = current.next;
            return;
        }
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next; //It's wrong when deleting last node, But never give error you get expected output :)
                return;
            }
            current = current.next;
        }
        return;
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.appendNode(20);
        l.appendNode(50);
        l.prependNode(80);
        l.appendNode(10);
        l.deleteNode(80);
        l.deleteNode(20);
        while (l.head != null) {
            System.out.println("Node data: " + l.head.data);
            l.head = l.head.next;
        }
    }

}
