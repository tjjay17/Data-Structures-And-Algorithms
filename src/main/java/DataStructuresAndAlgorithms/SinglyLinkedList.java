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

 class Node{
     int value;
     Node next;
     
    Node(int val){
        this.value = val;
        this.next = null;
    }
}
public class SinglyLinkedList {
    Node head;
    Node tail;
    int length;
    
    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    
    public void push(int val){
        Node newNode = new Node(val);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
            newNode.next = null;
            length++;
        }else{
            this.tail.next = newNode;
            this.tail = newNode;
            //this.tail.next = null;
            length++;
        }     
    }
    
    public static void main(String [] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.push(3);
//        list.push(4);
//        list.push(6);
        
        System.out.println("Head " + list.head.value + " Tail: " + list.tail.value);
    }
    
    
  
}


