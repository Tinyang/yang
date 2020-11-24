package study.dataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedBinaryTree<Y> extends AbstractBinaryTree<Y> {
    protected Node<Y> root = null;
    private int size = 0;

    protected static class Node<Y> implements Position<Y> {
        private Y element;
        private Node<Y> parent;
        private Node<Y> left;
        private Node<Y> right;

        public Node(Y element, Node<Y> parent, Node<Y> left, Node<Y> right) {
            this.element = element;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        @Override
        public Y getElement() {
            return element;
        }

        public void setElement(Y element) {
            this.element = element;
        }

        public Node<Y> getParent() {
            return parent;
        }

        public void setParent(Node<Y> parent) {
            this.parent = parent;
        }

        public Node<Y> getLeft() {
            return left;
        }

        public void setLeft(Node<Y> left) {
            this.left = left;
        }

        public Node<Y> getRight() {
            return right;
        }

        public void setRight(Node<Y> right) {
            this.right = right;
        }
    }

    protected Node<Y> createNode(Y element, Node<Y> parent, Node<Y> left, Node<Y> right) {
        return new Node<Y>(element, parent, left, right);
    }

    protected Node<Y> validate(Position<Y> position) {
        if (!(position instanceof  Node)) {
            throw new IllegalArgumentException("Not valid position type");
        }
        Node<Y> node = (Node<Y>) position;
        if (node.getParent() == node) {
            throw new IllegalArgumentException("p is no longer in the tree");
        }
        return node;
    }

    @Override
    public Position<Y> root() {
        return root;
    }

    @Override
    public Position<Y> parent(Position<Y> p) {
        Node<Y> e = validate(p);
        return e.getParent();
    }

    @Override
    public Iterable<Position<Y>> children(Position<Y> p) {
        List<Position<Y>> list = new ArrayList<>();
        Node<Y> e = validate(p);
        list.add(e.getLeft());
        list.add(e.getRight());
        return list;
    }

    @Override
    public int numChildren(Position<Y> p) {
        Node<Y> e = validate(p);
        int childrenNums = 0;
        if (null != e.getLeft()) {
            childrenNums ++;
        }
        if (null != e.getRight()) {
            childrenNums ++;
        }
        return childrenNums;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<Y> iterator() {
        return null;
    }

    @Override
    public Iterable<Position<Y>> positions() {
        List<Position<Y>> list = new ArrayList<>();
        Node<Y> e = validate(root);
        iterateAll(list, e);
        return list;
    }

    private void iterateAll(List list, Node<Y> e) {
        list.add(e);
        while (null != e) {
            iterateAll(list, e.left);
            iterateAll(list, e.right);
        }
    }

    @Override
    public Position<Y> left(Position<Y> p) {
        Node<Y> node = validate(p);
        return node.getLeft();
    }

    @Override
    public Position<Y> right(Position<Y> p) {
        Node<Y> node = validate(p);
        return node.getRight();
    }


}
