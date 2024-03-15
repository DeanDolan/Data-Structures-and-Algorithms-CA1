/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package playlist;

/**
 *
 * @author deand
 */
public interface StackInterface {
    public boolean isEmpty();
    public boolean isFull();
    public void push(Object newItem);
    public Object pop();
   
}
