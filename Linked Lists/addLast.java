// Add last in a linked list.

public class addLast {
    public static class Node {
        int data;
        Node next;
      }
    
      public static class LinkedList {
        Node head;
        Node tail;
        int size;
    
        void addLast(int val) {
          
          Node temp = new Node();
          temp.data = val;
          
          if(size == 0){
              head = tail = temp;
          }else{
              tail.next = temp;
              tail = temp;
          }
          
          size++;
        }
      } 
}