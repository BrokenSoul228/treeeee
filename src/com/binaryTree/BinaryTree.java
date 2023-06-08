package com.binaryTree;

public class BinaryTree<T extends Comparable<T>> {
    Node<T> root;

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    private Node<T> addElement(Node<T> current, T t) {
        if (current == null) {
            return new Node<>(t);
        }
        if (t.compareTo(current.getValue()) < 0) {
            current.setLeft(addElement(current.getLeft(), t));
        } else if (t.compareTo(current.getValue()) > 0) {
            current.setRight(addElement(current.getRight(), t));
        }
        return current;
    }

    public void add(T t) {
        root = addElement(root, t);
    }

    public boolean contains(Node<T> current, T t) {
        if (current == null) {
            return false;
        }
        if (t.equals(current.getValue())) {
            return true;
        }
        return t.compareTo(current.getValue()) < 0 ? contains(current.getLeft(), t) : contains(current.getRight(), t);
    }

    public Node<T> find(Node<T> current, T t) {
        if (current == null) {
            return null;
        }
        if (t.compareTo(current.getValue()) == 0) {
            return current;
        }
        return t.compareTo(current.getValue()) < 0 ? find(current.getLeft(), t) : find(current.getRight(), t);
    }

    @Override
    public String toString(){
        return this.toString();
    }

    public void output(Node<T> current) {
        if (current != null) {
            System.out.println(current.getValue());
            output(current.getLeft());
            output(current.getRight());
        }
    }
}