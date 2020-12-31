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
       this.tail = newTail;
       this.length--;
       //System.out.println(current);
       return current;
    }
    
    //Shift will just remove the head from the list and return that; a pop from beginning.
    public Node shift(){
        Node currentHead = this.head;
        Node nextHead = currentHead.next;
        
        currentHead.next = null;
        this.head = nextHead;
        this.length--;
        return currentHead;
    }
    
    //add in a new head
    public void unshift(int val){
        if(this.head == null){
            this.head = new Node(val);
            this.tail = new Node(val);
        }else{
            Node toAdd = new Node(val);
            Node currentHead = this.head;
            toAdd.next = currentHead;
            this.head = toAdd;
            this.length++;
        } 
    }
    
    public Node get(int index){
        if(index < 0 || index > this.length){
            return null;
        }
        Node current = this.head;
        int count  = 0; 
        
        while(count != index){
            current = current.next;
            count++;
        }
        return current;
    }
    
    @Override
    public String toString(){
        String toReturn = "Head: " + this.head.value + " Tail: " + this.tail.value + " HeadNext: " + this.head.next.value;
        return toReturn;
    }
    
    public static void main(String [] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.push(2);
        list.push(3);
        list.push(8);
        list.push(7);
        System.out.println(list);
        list.pop();
        System.out.println(list);
        list.shift();
        System.out.println(list);
        list.unshift(4);
        System.out.println(list);
    }
}


