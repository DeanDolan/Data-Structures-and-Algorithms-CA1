/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package playlist;

/**
 *
 * @author deand
 */
/*
 * QueueInterface represents the interface for a queue data structure.
 * It defines methods to manipulate a queue, such as checking if it's empty,
 * obtaining its size, accessing the front element, enqueueing new items,
 * and dequeueing items.
 */
public interface QueueInterface {

    /**
     * Checks whether the queue is empty.
     *
     * @return true if the queue is empty, false otherwise.
     */
    public boolean isEmpty();

    /**
     * Retrieves the size of the queue.
     *
     * @return The number of elements in the queue.
     */
    public int size();

    /**
     * Retrieves the front element of the queue without removing it.
     *
     * @return The front element of the queue.
     */
    public Object frontElement();

    /**
     * Enqueues a new item into the queue.
     *
     * @param newItem The item to be added to the queue.
     */
    public void enqueue(Object newItem);

    /**
     * Removes and returns the front element of the queue.
     *
     * @return The front element of the queue.
     */
    public Object dequeue();
}
