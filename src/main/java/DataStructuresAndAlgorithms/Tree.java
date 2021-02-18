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
    
//    @Override
//    public String toString(){
//        System.out.println(this.root);
//    }
    
    public static void main(String [] args){
        tNode root = new tNode(4);
        Tree tree = new Tree(root);
        root.left = new tNode(2);
        root.right = new tNode(8);
        root.right.right = new tNode(12);
        root.right.left = new tNode(6);
        System.out.println(tree.BFS());
    }
}
