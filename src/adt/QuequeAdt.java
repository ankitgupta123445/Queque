package adt;

public interface QuequeAdt<E> {
    boolean add(E item);

    boolean add(E item, int index);

    E remove();

    E peek();

    E poll();

    E element();
}

