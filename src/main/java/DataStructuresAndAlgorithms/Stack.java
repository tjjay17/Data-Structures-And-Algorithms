package DataStructuresAndAlgorithms;

/**
 *
 * @author Tj
 */
public class Stack {
    SinglyLinkedList list;
    int size;
    public Stack(){
        this.list = new SinglyLinkedList();
        this.size = 0;
    }
    
    public int pop(){
        Node popped = this.list.shift();
        System.out.println(popped.value);
        this.size--;
        return popped.value;
    }
    
    public void push(int val){
        this.list.unshift(val);
        this.size++;
    }
    
    @Override
    public String toString(){
        String toReturn = "";
        int count = 0;
        Node current = this.list.head;
        
        while(count != this.list.length){
            toReturn = " " + current.value + " ";
            current = current.next;
            count++;
        }
        return toReturn;
}
    public static void main(String [] args){
        Stack newStack = new Stack();
        newStack.push(1);
        newStack.push(9);
        newStack.push(18);
        System.out.println(newStack.list);
        newStack.pop();
        System.out.println(newStack.list);
        newStack.pop();
        System.out.println(newStack.list);
        newStack.pop();
        System.out.println(newStack.list);
    }
}
