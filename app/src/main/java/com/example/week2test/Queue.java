package com.example.week2test;

import java.util.Stack;

public class Queue {
Stack line;
    public Queue() {
        line = new Stack();
    }

    public void enqueue(int i){
        if (line.empty()) {
            line.push(i);
        } else {
            Stack another = new Stack();
            while (!line.empty()) {
                another.push(line.pop());
            }
            line.push(i);
            while (!another.empty()) {
                line.push(another.pop());
            }
        }
    }

    public void printAndEmptyList(){
        while (!line.isEmpty())
        {
            System.err.println(line.pop());
        }
    }

    public int dequeue(){
        return (int) line.pop();
    }
}
