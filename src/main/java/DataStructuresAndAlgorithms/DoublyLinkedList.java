
package DataStructuresAndAlgorithms;

 class dNode{
    dNode next;
    dNode prev;
    int value;
   
    dNode(int val){
        this.value = val;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLinkedList {
   dNode head;
   dNode tail;
   int length;
   
   public DoublyLinkedList(){
       this.head = null;
       this.tail = null;
       this.length = 0;
   }
   
   public void push(int val){
       dNode newNode = new dNode(val);
       
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
   
   public dNode pop(){
       dNode popped = this.head;
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
           dNode beforeTail = this.tail.prev;
           popped.prev = null;
           beforeTail.next = null;
           this.tail = beforeTail;
           this.length--;
           return popped;
       }
   }
   
   public dNode shift(){
       dNode toRemove = null;
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
           dNode headNext = this.head.next;
           this.head.next = null;
           headNext.prev = null;
           this.length--;
           return toRemove;
       }
   }
   
   public void unshift(int val){
       dNode newNode = new dNode(val);
       dNode currentHead = this.head;
       
       if(this.length == 0){
           this.head = newNode;
           this.tail = newNode;
       }
       
       currentHead.prev = newNode;
       newNode.next = currentHead;
       this.head = newNode;
       this.length++;
   }
   
   public dNode get(int index){
       int mid = (int) Math.floor(this.length / 2);
       if(this.length == 1){
           return this.head;
       }

       if(index > mid){
           int count = this.length - 1;
           dNode current = this.tail;
           while(count != index){
                current = current.prev;
                count--;
           }
           return current;
       }else{
           int count = 0;
           dNode current = this.head;
           while(count != index){
               current = current.next;
               count++;
           }
           return current;
       }
   }
   
   public void set(int index, int value){
       if(index < 0 || index >= this.length){
           System.out.println("Set: Out of Bounds");
       }else{
           dNode toChange = this.get(index);
           toChange.value = value;
       }
   }
   
   public void insert(int index, int value){
       if(index < 0 || index > this.length){
           System.out.println("Insert: Out of Bounds");
       }else if(index == this.length - 1){
           this.push(value);
       }else{
           dNode atIndex = this.get(index);
           dNode after = this.get(index + 1);
           dNode toInsert = new dNode(value);
           
           atIndex.next = toInsert;
           toInsert.prev = atIndex;
           toInsert.next = after;
           after.prev = toInsert;
           this.length++;
       }
   }
   
   public void remove(int index){
       if(index < 0 || index > this.length){
           System.out.println("Remove: Out of Bounds");
       } else if(index == 0){
           this.shift();
       }else if(index == this.length - 1){
           this.pop();
       }else{
           dNode beforeRem = this.get(index - 1);
           dNode afterRem = this.get(index + 1);
           dNode toRem = this.get(index);
           
           toRem.next = null;
           toRem.prev = null;
           beforeRem.next = afterRem;
           afterRem.prev = beforeRem;
           this.length--;
       }
   }
   
   @Override
   public String toString(){
       String toReturn = "";
       int count = 0;
       dNode current = this.head;
       
       while(count != this.length){
           toReturn = toReturn + " " + current.value + " ";
           current = current.next;
           count++;
       }
       return toReturn;
   }
   
   public static void main(String [] args){
       DoublyLinkedList list = new DoublyLinkedList();
       list.push(1);
       list.push(2);
       list.push(3);
       list.push(4);
       System.out.println(list);
       list.pop();
       list.insert(2,9);
       System.out.println(list);
       list.remove(1);
       System.out.println(list);
       
   }
}
