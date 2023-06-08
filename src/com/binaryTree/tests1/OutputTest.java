package com.binaryTree.tests1;

import org.junit.jupiter.api.Test;
import com.binaryTree.BinaryTree;


public class OutputTest{

    @Test
    public void outputTest() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(4);
        tree.add(7);
        tree.add(9);
        tree.output(tree.getRoot());
    }
}