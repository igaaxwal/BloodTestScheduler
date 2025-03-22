/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

import java.util.PriorityQueue;
import interfaces.PriorityQueueInterface;

public class PriorityQueueADT<T extends Comparable<T>> implements PriorityQueueInterface<T> {
    private PriorityQueue<T> queue;

    public PriorityQueueADT() {
        queue = new PriorityQueue<>();
    }

    @Override
    public void enqueue(T item) {
        queue.add(item);
    }

    @Override
    public T dequeue() {
        return queue.poll();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}


