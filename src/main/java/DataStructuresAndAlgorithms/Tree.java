/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms;
import java.util.*;

/**
 *
 * @author Tj
 */

class tNode{
        int value;
        tNode left = null;
        tNode right = null;
        
        public tNode(int value){
            this.value = value;
        }
        
        public tNode(int value, tNode right, tNode left){
            this.value = value;
            this.left = left;
            this.right = right;
        }
        
        @Override
        public String toString(){
           return Integer.toString(this.value); 
        }
    }

public class Tree {
    tNode root;
    
    
    public Tree(tNode t){
        this.root = t;
    }
    
    public ArrayList <tNode> BFS(){
       ArrayList <tNode> queue = new ArrayList <tNode>();
       ArrayList <tNode> visited = new ArrayList <tNode>();
       queue.add(root);
       tNode pulled = null;
       
       while(queue.size() != 0){
           pulled = queue.get(0);
           if(pulled.left != null){
               queue.add(pulled.left);
           }
           
           if(pulled.right != null){
               queue.add(pulled.right);
           }
           
           visited.add(pulled);
           queue.remove(pulled);
       }
       return visited;
    }
    
    ArrayList <Integer> preOrderStored = new ArrayList<Integer>();
    public ArrayList <Integer> preorderDFS(tNode node){
        preOrderStored.add(node.value);
        if(node.left != null){
            preorderDFS(node.left);
        }
        if(node.right != null){
            preorderDFS(node.right);
        }
        return preOrderStored;
    }
    
    ArrayList <Integer> postOrderStored = new ArrayList <Integer>();
    public ArrayList <Integer> postOrderDFS(tNode node){
        if(node.left != null){
           postOrderDFS(node.left);
        }
        
        if(node.right != null){
            postOrderDFS(node.right);
        }
        postOrderStored.add(node.value);
        return postOrderStored;
    }
    
    ArrayList <Integer> inOrderStored = new ArrayList<Integer>();
    public ArrayList <Integer> inOrderDFS(tNode node){
        if(node.left != null){
            inOrderDFS(node.left);
        }
        inOrderStored.add(node.value);
        if(node.right != null){
            inOrderDFS(node.right);
        }
        return inOrderStored;
    }
        
    public static void main(String [] args){
        tNode root = new tNode(4);
        tNode root2 = new tNode(10);
        root2.left = new tNode(8);
        root2.right = new tNode(12);
        root2.left.left = new tNode(3);
        root2.left.right = new tNode(9);
        root2.right.left = new tNode(11);
        root2.right.right = new tNode(14);
        Tree tree = new Tree(root);
        Tree tree2 = new Tree(root2);
        root.left = new tNode(2);
        root.right = new tNode(8);
        root.right.right = new tNode(12);
        root.right.left = new tNode(6);
        System.out.println(tree.BFS());
        System.out.println(tree2.preorderDFS(root2));
        System.out.println(tree2.postOrderDFS(root2));
        System.out.println(tree2.inOrderDFS(root2));
    }
}
