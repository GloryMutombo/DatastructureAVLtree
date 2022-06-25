/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avl;

/**
 *
 * @author glorymutombo
 */
public class Main {
    public static void main(String[] args) {
        AVL tree = new AVL();
/* Constructing tree given in the above figure */
tree.root = tree.insert(tree.root, 10);
tree.root = tree.insert(tree.root, 20);
tree.root = tree.insert(tree.root, 30);
tree.root = tree.insert(tree.root, 40);
tree.root = tree.insert(tree.root, 50);
tree.root = tree.insert(tree.root, 25);
System.out.println("Preorder traversal" +
" of constructed tree is : ");
tree.preOrder(tree.root);
    }
    
}
