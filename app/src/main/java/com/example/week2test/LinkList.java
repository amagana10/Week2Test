package com.example.week2test;

public class LinkList {
    Node head;  // head of list

    class Node
    {
        char data;
        Node next;


        Node(char d) {data = d;}
    }
    public void pushToFront(char newData)
    {
        Node new_node = new Node(newData);

        new_node.next = head;

        head = new_node;
    }
    public void addToBack(char newData)
    {
        Node new_node = new Node(newData);

        if (head == null)
        {
            head = new Node(newData);
            return;
        }
        new_node.next = null;


        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;
        return;

    }




    void deleteNode(int position)
    {
        if (head == null)
            return;

        Node temp = head;

        if (position == 0)
        {
            head = temp.next;
            return;
        }

        // Find previous node of the node to be deleted
        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;

        // If position is more than number of ndoes
        if (temp == null || temp.next == null)
            return;

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;

        temp.next = next;  // Unlink the deleted node from list
    }
    public void printList()
    {
        Node tempnode = head;
        while (tempnode != null)
        {
            System.out.print(tempnode.data+" ");
            tempnode = tempnode.next;
        }
        System.out.println();
    }
}
