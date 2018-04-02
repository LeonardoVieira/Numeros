package com.s2it.prova.binarytree;

public class BinaryTree {

	private int valor;

	private BinaryTree left;

	private BinaryTree right;

	public BinaryTree(int valor) {
		this.valor = valor;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * @return the left
	 */
	public BinaryTree getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public BinaryTree getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(BinaryTree right) {
		this.right = right;
	}
}