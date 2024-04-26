package com.mmkarami.binary.tree.bfs.levelorder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryTreeAdtTest {

	private BinaryTreeAdt<String> tree;

	@BeforeEach
	public void initBinaryTree() {
		
		Node<String> n9 = new Node<String>("N9", null, null);
		Node<String> n8 = new Node<String>("N8", null, null);
		Node<String> n4 = new Node<String>("N4", n8, n9);

		Node<String> n5 = new Node<String>("N5", null, null);
		Node<String> n2 = new Node<String>("N2", n4, n5);

		Node<String> n6 = new Node<String>("N6", null, null);
		Node<String> n7 = new Node<String>("N7", null, null);
		Node<String> n3 = new Node<String>("N3", n6, n7);

		Node<String> n1 = new Node<String>("N1", n2, n3);

		tree = new BinaryTreeAdt<>(n1);
	}

	@Test
	public void testCreateTreeWithoutNode_whenCreateTreeWithoutNode_thenItMustBeCreatedTreeWithoutNode() {

		System.out.println("7777");
		// Arrange
		BinaryTreeAdt<String> tree;

		// Act
		tree = new BinaryTreeAdt<>();

		// Assert
		assertEquals(0, tree.size());
	}

	@Test
	public void testPreOrderTraverse_whenTraverseTreePreOrder_thenItMustReturnStringOfNodesInPreOrderSequence() {
		
		System.out.println("999999");

		// Arrange
		BinaryTreeAdt<String> tree = this.tree;

		// Act
		String result = tree.traverse();

		// Assert
		System.out.println(result);
		assertEquals("N1 N2 N3 N4 N5 N6 N7 N8 N9 ", result);
	}
}