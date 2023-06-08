package com.binaryTree.tests1;


import org.junit.jupiter.api.Test;
import com.binaryTree.BinaryTree;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ContainsTest{                                                                            //Contains Test

    @Test
    public void containsTest() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(4);
        tree.add(7);
        tree.add(9);
        assertTrue(tree.contains(tree.getRoot(), 5));
        assertTrue(tree.contains(tree.getRoot(), 3));
        assertTrue(tree.contains(tree.getRoot(), 4));
        assertTrue(tree.contains(tree.getRoot(), 9));
        assertTrue(tree.contains(tree.getRoot(), 7));
    }
}