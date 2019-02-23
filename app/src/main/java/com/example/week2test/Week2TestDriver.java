package com.example.week2test;

public class Week2TestDriver {
    public static void main(String[] args) {

        //. Convert a given string to a linkedList of characters in the String.
        //Do not use LinkedList class in Java but create it from scratch.
        // Should also add and remove elements from the list.



        LinkList list = convertStringToLinkList("0123456789");
        list.printList();
        list.deleteNode(5);
        list.printList();

        //2. Implement a Queue using Stack.
        //  Queue should have enqueue and dequeue methods
        Queue line = new Queue();
        line.enqueue(1);
        line.enqueue(2);
        line.enqueue(3);
        line.enqueue(4);
        line.enqueue(5);
        line.dequeue();
        line.dequeue();
        line.printAndEmptyList();

        // 3. Create a custom arraylist using generics.
        // The size of the array would be doubled when
        // array limit is reached.
        CustomArrayList<String> arrayList = new CustomArrayList<String>();
        arrayList.add("Hello1");
        arrayList.add("Hello2");
        arrayList.add("Hello3");
        arrayList.add("Hello4");
        arrayList.add("Hello5");

        //4. Create and Binary Search tree with Add and print(preorder) method.
        int[] array = {50,32,13,65,34,22,3,76,90};
        Bst bst = new Bst();
        for (int num: array) {
            bst.add(num);
        }
        bst.preorder();

    }

    public static LinkList convertStringToLinkList(String string){
        char[] array = string.toCharArray();

        LinkList list = new LinkList();
        for (char thisChar: array) {
            list.addToBack(thisChar);
        }
        return list;
    }

}
