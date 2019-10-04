public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }   
    public void remove() {
        Node current = head; 
        if(head == null) {
            return;
        }
        if(current.next == null) {
            head = null;
            return;
        }
        while(current.next.next !=null) {
            current = current.next;
        }
        current.next = null;
    }
    public void printValues() {
        if(head == null) {
            return;
        }
        Node current = head;
        while(current != null) {
            System.out.println(current.value + ",");

            current = current.next;
        }
        System.out.print(current);
    } 
}