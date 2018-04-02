package com.s2it.prova.binarytree;

public class BinaryTreeService {

	public Integer retornaSoma(BinaryTree tree, Integer somaInicial) {
		if(tree == null) {
			return somaInicial;
		}

		somaInicial = retornaSoma(tree.getLeft(), somaInicial += tree.getValor());
		return retornaSoma(tree.getRight(), somaInicial);
	}
}