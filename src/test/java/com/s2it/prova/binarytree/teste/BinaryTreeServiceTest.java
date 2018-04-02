package com.s2it.prova.binarytree.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.s2it.prova.binarytree.BinaryTree;
import com.s2it.prova.binarytree.BinaryTreeService;

public class BinaryTreeServiceTest {

	BinaryTreeService binaryTreeService = new BinaryTreeService();

	@Test
	public void calculaArvoreSucesso() {
		BinaryTree binaryTree1 = new BinaryTree(1);
		BinaryTree binaryTree2 = new BinaryTree(2);
		BinaryTree binaryTree3 = new BinaryTree(3);
		BinaryTree binaryTree4 = new BinaryTree(4);
		BinaryTree binaryTree5 = new BinaryTree(5);
		BinaryTree binaryTree6 = new BinaryTree(6);
		BinaryTree binaryTree7 = new BinaryTree(7);

		binaryTree1.setRight(binaryTree4);
		binaryTree1.setLeft(binaryTree2);

		binaryTree2.setRight(binaryTree3);
		binaryTree2.setLeft(binaryTree6);

		binaryTree4.setRight(binaryTree5);
		binaryTree4.setLeft(binaryTree7);

		Integer retornaSoma = binaryTreeService.retornaSoma(binaryTree1, 0);
		assertTrue("Soma não resultou em 28", retornaSoma == 28);
	}
}