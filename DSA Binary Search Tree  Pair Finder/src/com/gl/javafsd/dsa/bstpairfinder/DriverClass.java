package com.gl.javafsd.dsa.bstpairfinder;

public class DriverClass {

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(40);
		tree.insert(20);
		tree.insert(10);
		tree.insert(30);
		tree.insert(60);
		tree.insert(50);
		tree.insert(70);

		// Program checked for these Sum values 130, 80, 100, 5, 115

		BinarySearchTreePairFinder finder = new BinarySearchTreePairFinder(tree, 130);
		finder.findPairOfNodes();
	}

}
