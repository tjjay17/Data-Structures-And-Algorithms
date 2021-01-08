package DataStructuresAndAlgorithms;

/**
 *
 * @author Tj
 */
public class Stack {
    SinglyLinkedList list;
    public Stack(){
        this.list = new SinglyLinkedList();
    }
    
    public int pop(){
        Node popped = this.list.shift();
        System.out.println(popped.value);
        return popped.value;
    }
    
    public void push(int val){
        this.list.unshift(val);
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
