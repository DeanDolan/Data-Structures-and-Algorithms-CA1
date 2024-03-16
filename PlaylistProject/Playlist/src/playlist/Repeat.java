/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;

import java.util.ArrayList;

/**
 *
 * @author deand
 */
/**
 * Represents a repeat queue for songs in a playlist. Implements QueueInterface.
 */
public class Repeat implements QueueInterface {

    // ArrayList to hold the queue elements
    private ArrayList<LikedSongs> theQueue;

    // Constructor initializing theQueue
    public Repeat() {
        theQueue = new ArrayList<LikedSongs>();
    }

    // Method to check if the queue is empty
    @Override
    public boolean isEmpty() {
        return theQueue.isEmpty();
    }

    // Method to get the size of the queue
    @Override
    public int size() {
        return theQueue.size();
    }

    // Method to get the front element of the queue
    @Override
    public Object frontElement() {
        if (theQueue.size() > 0) {
            return theQueue.get(0);
        } else {
            return null;
        }
    }

    // Method to add an item to the end of the queue
    @Override
    public void enqueue(Object newItem) {
        theQueue.add((LikedSongs) newItem);
    }

    // Method to remove and return the front element of the queue
    @Override
    public Object dequeue() {
        if (theQueue.size() > 0) {
            return theQueue.remove(0);
        } else {
            return null;
        }
    }
}
