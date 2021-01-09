
package DataStructuresAndAlgorithms;

/**
 *
 * @author Tj
 */
public class Queue {
   Node first;
   Node last;
   int size;
   
   public Queue(){
       this.first = null;
       this.last = null;
       this.size = 0;
   }
   
   public void enqueue(int val){
       Node toAdd = new Node(val);
       
       if(this.size == 0){
           this.first = toAdd;
           this.last = toAdd;
           this.size++;
       }else{
           this.last.next = toAdd;
           this.last = toAdd;
           this.size++;
       }
   }
   
   public Node dequeue(){
       if(this.size == 0){
           System.out.println("Cannot be done");
           return null;
       }else if(this.size == 1){
           Node popped = this.first;
           this.first = null;
           this.last = null;
           this.size--;
           return popped;
       }else{
           Node currentFirst = this.first;
           Node nextToFirst = this.first.next;
           this.first.next = null;
           this.first = nextToFirst;
           this.size--;
           return currentFirst;
       }
   }
   
   public String toString(){
       String toReturn = "";
       int count = 0;
       Node current = this.first;
       
       while (count != this.size){
           toReturn = toReturn + " " + current.value;
           current = current.next;
           count++;
       }
       
       return toReturn;
   }
   
   public static void main(String [] args){
       Queue q = new Queue();
       q.enqueue(2);
       q.enqueue(4);
       q.enqueue(8);
       System.out.println(q);
       q.dequeue();
       System.out.println(q);
   }
}
