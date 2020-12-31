package DataStructuresAndAlgorithms;
 
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
            length++;
        }     
    }
    
    public Node pop(){
       Node current = this.head;
       Node newTail = null;
       
       if(this.length == 1){
           return this.head;
       }else if(this.length ==0){
           return null;
       }
       
       while(current.next != null){
           newTail = current;
           current = current.next;
       }
       
       newTail.next = null;
       this.length--;
        System.out.println(current);
       return current;
    }
    
    public static void main(String [] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.push(2);
        list.push(3);
        list.push(8);
        list.push(7);
    }
}


