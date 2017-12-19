package linkedliststack;

import java.util.EmptyStackException;

/**
 *
 * @author jeffrowell
 */
public class LinkedListStack 
{

    private Node firstNode;

    public LinkedListStack() 
    {
        firstNode = null;
    }

    public void push(char character) 
    {
        Node newNode = new Node(character, firstNode);
        firstNode = newNode;
    }

    public char peek() 
    {
        if (isEmpty()) 
        {
            throw new EmptyStackException();
        } 
        else {
            return firstNode.getData();
        }
    }

    public char pop() 
    {
        char temp = peek();
        Node deallocate = firstNode;
        assert firstNode != null;
        firstNode = firstNode.getNext();
        deallocate.setNext(null);
        deallocate = null;
        return temp;
    }

    public boolean isEmpty() 
    {
        return firstNode == null;
    }

    public void clear() 
    {
        firstNode = null;
    }

    private class Node 
    {

        private char data;
        private Node next;

        private Node(char character, Node next) 
        {
            this.data = character;
            this.next = next;
        }

        public Node getNext() 
        {
            return next;
        }

        public void setNext(Node next) 
        {
            this.next = next;
        }

        public char getData() 
        {
            return data;
        }

        public void setData(char character) 
        {
            this.data = character;
        }
    }
}
