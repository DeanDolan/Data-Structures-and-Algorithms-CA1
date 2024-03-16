/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package playlist;

/**
 *
 * @author deand
 */
// Define a public interface named StackInterface
public interface StackInterface {

    // Method signature for checking if the stack is empty
    public boolean isEmpty();

    // Method signature for checking if the stack is full
    public boolean isFull();

    // Method signature for pushing an item onto the stack
    public void push(Object newItem);

    // Method signature for popping an item off the stack
    public Object pop();
}
