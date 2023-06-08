package com.binaryTree.tests1;

import org.junit.jupiter.api.Test;
import com.binaryTree.BinaryTree;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AddTest{                                                                           //Add Test

    @Test
    public void addTest() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(6);
        tree.add(7);
        tree.add(4);
        tree.add(10);
        assertEquals(5, tree.getRoot().getValue());
        assertEquals(3, tree.getRoot().getLeft().getValue());
        assertEquals(6, tree.getRoot().getRight().getValue());
        assertEquals(7, tree.getRoot().getRight().getRight().getValue());
        assertEquals(4, tree.getRoot().getLeft().getRight().getValue());
        assertEquals(10, tree.getRoot().getRight().getRight().getRight().getValue());
    }
}