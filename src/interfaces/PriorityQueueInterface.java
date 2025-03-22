/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author igawa
 */

public interface PriorityQueueInterface<T> {
    void enqueue(T item);
    T dequeue();
    boolean isEmpty();
}