/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms;

/**
 *
 * @author Tj
 */
 class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    int count;
    
    TreeNode(int val){
        this.value = val;
        this.left = null;
        this.right = null;
        this.count = 1;
    }
}
public class BinarySearchTree {
    TreeNode root;
    
    BinarySearchTree(){
        this.root = null;
    }
    
    public void insert(int value){
        boolean isNull = false;
        TreeNode newNode = new TreeNode(value);
        TreeNode current = this.root;
        
        if(current == null){
            this.root = newNode;
        }else{
            while(!isNull){
                if(value < current.value){
                    if(current.left != null){
                        current = current.left;
                    }else{
                        isNull = true;
                        current.left = newNode;
                    }
                }else if(value > current.value){
                    if(current.right != null){
                        current = current.right;
                    }else{
                        isNull = true;
                        current.right = newNode;
                    }
                }else{
                    isNull = true;
                    current.count++;
                }
            
            }
        } 
    }
    
    public TreeNode Search(int value){
        boolean isFound = false;
        TreeNode current= this.root;
        
        while(!isFound){
            if(current.value == value){
                isFound = true;
                return current;
            }else if(value > current.value){
                if(current.right != null){
                    current = current.right;
                }else{
                    isFound = true;
                    return null;
                }
            }else{
                if(current.left != null){
                    current = current.left;
                }else{
                    isFound = true;
                    return null;
                }
            }
        }
        return current;
    }
    
    public static void main(String []args){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(15);
        tree.insert(9);
        System.out.println(tree.root.value);
        System.out.println(tree.root.right.value);
        System.out.println(tree.root.left.value);
        System.out.println(tree.Search(9).value);
        tree.insert(88);
        System.out.println(tree.root.right.right.value);
    }
}
