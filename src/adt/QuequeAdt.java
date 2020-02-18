package adt;

public interface QuequeAdt<E> {
    boolean add(E item);

    boolean add(E item, int index);
    /*
 The remove() and poll() methods remove and return the head of the queue. Exactly which element is removed from the queue is a function
of the queue's ordering policy, which differs from implementation to implementation. The remove() and poll() methods differ only in their behavior
 when the queue is empty: the remove() method throws an exception, while the poll() method returns null.
*/

    E remove();

    E peek();

    E poll();

    E element();
}


