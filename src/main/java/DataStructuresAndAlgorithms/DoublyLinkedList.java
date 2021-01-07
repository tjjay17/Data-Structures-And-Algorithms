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
    Node next;
    Node prev;
    int value;
   
    Node(int val){
        this.value = val;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLinkedList {
   Node head;
   Node tail;
   int length;
   
   public DoublyLinkedList(){
       this.head = null;
       this.tail = null;
       this.length = 0;
   }
   
   public void push(int val){
       Node newNode = new Node(val);
       
       if(this.length == 0){
           this.head = newNode;
           this.tail = newNode;
       }else{
           this.tail.next = newNode;
           newNode.prev = this.tail;
           this.tail = newNode;
       }
       this.length++;
   }
   
   public Node pop(){
       Node popped = this.head;
       if(this.length == 0){
           return null;
       }else if(this.length == 1){
           this.length--;
           popped = this.head;
           this.head = null;
           this.tail = null;
           this.length--;
           return popped;
       }else{
           popped = this.tail;
           popped.prev = null;
           Node beforeTail = this.tail.prev;
           beforeTail.next = null;
           this.tail = beforeTail;
           this.length--;
           return popped;
       }
   }
   
   public Node shift(){
       Node toRemove = null;
       if(this.length == 0){
           return null;
       }else if(this.length == 1 ){
           toRemove = this.head;
           this.head = null;
           this.tail = null;
           this.length--;
           return toRemove;
       }else{
           toRemove = this.head;
           Node headNext = this.head.next;
           this.head.next = null;
           headNext.prev = null;
           this.length--;
           return toRemove;
       }
   }
   
   public void unshift(int val){
       Node newNode = new Node(val);
       Node currentHead = this.head;
       
       if(this.length == 0){
           this.head = newNode;
           this.tail = newNode;
       }
       
       currentHead.prev = newNode;
       newNode.next = currentHead;
       this.head = newNode;
       this.length++;
   }
   
   public Node get(int index){
       int mid = (int) Math.floor(this.length / 2);
       if(this.length == 1){
           return this.head;
       }

       if(index > mid){
           int count = this.length - 1;
           Node current = this.tail;
           while(count != index){
                current = current.prev;
                count--;
           }
           return current;
       }else{
           int count = 0;
           Node current = this.head;
           while(count != index){
               current = current.next;
               count++;
           }
       }
   }
}
