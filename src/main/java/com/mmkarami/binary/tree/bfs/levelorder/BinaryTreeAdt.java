package com.mmkarami.binary.tree.bfs.levelorder;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeAdt<E> {

	private Node<E> root;

	public BinaryTreeAdt(Node<E> root) {
		this.root = root;
	}

	public BinaryTreeAdt() {
		this.root = null;
	}

	public Node<E> getRoot() {
		return root;
	}

	public void setRoot(Node<E> root) {
		this.root = root;
	}

	public void print() {
		printNodeValuesByBfsLevelorder(root);
	}

	public int size() {
		return sizeTreeByDfsPreOrder(root);
	}

	public String traverse() {
		return traverseNodeValuesByDfsPreOrder(root);
	}

	private void printNodeValuesByBfsLevelorder(Node<E> node) {
		if (node == null)
			return;
		Queue<Node<E>> queue = new LinkedList<>();
		queue.offer(node);
		while (!queue.isEmpty()) {
			Node<E> currentNode = queue.poll();
			System.out.println(currentNode);
			if (node.getLeft() != null)
				queue.offer(currentNode.getLeft());
			if (node.getRight() != null)
				queue.offer(currentNode.getRight());
		}
	}

	private int sizeTreeByDfsPreOrder(Node<E> node) {
		if (node == null)
			return 0;
		int sum = 0;
		System.out.println(sum);
		Queue<Node<E>> queue = new LinkedList<>();
		queue.offer(node);
		while (!queue.isEmpty()) {
			Node<E> currentNode = queue.poll();
			sum++;
			System.out.println(sum);
			if (currentNode.getLeft() != null)
				queue.offer(currentNode.getLeft());
			if (currentNode.getRight() != null)
				queue.offer(currentNode.getRight());
		}
		return sum;
	}

	private String traverseNodeValuesByDfsPreOrder(Node<E> node) {
		if (node == null)
			return "";
		String result = "";
		Queue<Node<E>> queue = new LinkedList<>();
		queue.offer(node);
		while (!queue.isEmpty()) {
			Node<E> currentNode = queue.poll();
			result += currentNode.toString() + " ";
			if (currentNode.getLeft() != null)
				queue.offer(currentNode.getLeft());
			if (currentNode.getRight() != null)
				queue.offer(currentNode.getRight());
		}
		return result;
	}
}