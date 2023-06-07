package com.binaryTree;
import com.binaryTree.Node;
public class BinaryTree <T extends Comparable<T>>{
    Node<T> root;

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    private Node<T> addElement (Node<T> current, T t){                    //добавляем елемент
        if (current == null){
            return new Node<>(t);
        }
        if (current.compareTo(root) > 0){
            current.setLeft(addElement(current.getLeft(), t));
        }
        else if (current.compareTo(root) < 0){
            current.setRight(addElement(current.getRight(), t));
        }
        return new Node<>(t);

    }
    public void add(T t) {
        root = addElement(root , t);
    }
    public boolean contains(Node<T> current, T t){                                         //проверка на нахождение этого элемента в дереве
        if (current == null){
            return false;
        }
        if (current.getValue().equals(t)){
            return true;
        }
        return t.compareTo(current.getValue()) > 0 ? contains(current.getLeft(), t) : contains(current.getRight(), t);
    }



    public String find(Node<T> current,T t){                                         //проверка на нахождение этого элемента в дереве
        if (t.equals(current.getValue())){
            return current.toString();
        }
        return t.compareTo(current.getValue()) < 0 ? find(current.getLeft(), t) : find(current.getRight(), t);
    }
        public void output(Node<T> current) {
        if (root != null && root.getLeft() != null && root.getRight() != null) {
            System.out.println("  " + root.toString() + "\n" + root.getLeft().toString() + " " + root.getRight().toString());
        }
        if (root != null && root.getLeft() != null && root.getRight() == null) {
            System.out.println("  " + root.toString() + "\n" + root.getLeft().toString());
        }
        if (root != null && root.getLeft() == null && root.getRight() != null) {
            System.out.println("  " + root.toString() + "\n" + root.getRight().toString());
        }
        if (current.getLeft() != null) {
            output(root.getLeft());
        }
        if (current.getRight() != null) {
            output(root.getRight());
        }
    }

}