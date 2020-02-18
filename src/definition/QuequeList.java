package definition;

import adt.QuequeAdt;

import java.util.NoSuchElementException;

public class QuequeList<E> implements QuequeAdt<E> {
    int size = 0;
    private Node<E> head = null;
    private Node<E> tail = null;

    private Node<E> getNode(int index) {
        Node<E> response = null;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index && temp != null; i++) {
                temp = temp.getNext();
            }
            response = temp;
        }

        return response;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        Node<E> temp = head;
        for (int i = 0; i < size && temp != null; i++) {
            E data = temp.getData();
            sb.append(data);
            sb.append((i < size - 1) ? "," : "");
            temp = temp.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    private boolean addFirst(E data) {
        Node<E> node = new Node<>(data, head, tail);
        head = node;
        tail = node;
        size++;
        return true;
    }

    private boolean addAfter(Node node, E data) {
        if (node.getNext() == null) {
            Node<E> node1 = new Node<>(data, node, tail);
            node.Next = node1;
            tail = node1;
            size++;
            return true;
        } else {
            Node<E> node1 = new Node<>(data, node, node.getNext());
            node1.previous = node;
            node1.Next = node.getNext();
            size++;
            return true;
        }
    }

    public boolean add(E item, int index) {
        addAfter(getNode(index - 1), item);
        return true;
    }

    @Override
    public boolean add(E item) {
        addFirst(item);
        return true;

    }

    private E removeFirst() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        E k = head.getData();
        head = head.Next;
        head.previous = null;
        size--;
        return k;

    }

    @Override
    public E remove() {
        return removeFirst();
    }

    @Override
    public E peek() {
        if (size == 0) {
            return null;
        }
        return head.getData();
    }

    @Override
    public E poll() {
        if (size == 0) {
            return null;
        }
        E k = head.getData();
        head = head.Next;
        head.previous = null;
        size--;
        return k;
    }

    @Override
    public E element() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return head.getData();
    }

    private class Node<E> {
        private E data;
        private Node<E> previous;
        private Node<E> Next;

        public Node(E data) {
            this.data = data;
        }

        public Node(E data, Node<E> previous, Node<E> next) {
            this.data = data;
            this.previous = previous;
            Next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getPrevious() {
            return previous;
        }

        public Node<E> getNext() {
            return Next;
        }
    }

}
