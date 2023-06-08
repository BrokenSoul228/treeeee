package com.binaryTree.tests1;

import com.binaryTree.Node;                                                                             //Find Test
import org.junit.jupiter.api.Test;
import com.binaryTree.BinaryTree;

import static org.junit.jupiter.api.Assertions.*;


public class TestFind{

    @Test
    public void testFind() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(4);
        tree.add(7);
        tree.add(9);
        Node<Integer> foundNode = tree.find(tree.getRoot(), 5);
        assertNotNull(foundNode);
        assertEquals(5, foundNode.getValue());
        foundNode = tree.find(tree.getRoot(), 7);
        assertNotNull(foundNode);
        assertEquals(7, foundNode.getValue());
        foundNode = tree.find(tree.getRoot(), 9);
        assertNotNull(foundNode);
        assertEquals(9, foundNode.getValue());
        foundNode = tree.find(tree.getRoot(), 4);
        assertNotNull(foundNode);
        assertEquals(4, foundNode.getValue());

    }
}