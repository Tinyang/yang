package study.algorithm;

import java.util.LinkedList;

public class ReverseLinkedList<E> {

    transient ReverseLinkedList.Node<E> first;

    /**
     * Pointer to last node.
     * Invariant: (first == null && last == null) ||
     *            (last.next == null && last.item != null)
     */
    transient ReverseLinkedList.Node<E> last;

    /**
     * Constructs an empty list.
     */
    public ReverseLinkedList() {
    }


    private static class Node<E> {
        E item;
        ReverseLinkedList.Node<E> next;
        ReverseLinkedList.Node<E> prev;

        Node(ReverseLinkedList.Node<E> prev, E element, ReverseLinkedList.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public Node<E> reverse(Node<E> node) {
        Node<E> current = node;
        Node<E> prev = null;
        Node<E> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}
