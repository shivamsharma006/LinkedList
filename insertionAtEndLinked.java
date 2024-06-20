class insertionAtEndLinked {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);
        //if LinkedList is empty
        if(head==null){
            head = new Node(newData);
            return;
        }
        newNode.next = null;
        //If linkedList is not empty
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }
    public void printNodes(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        insertionAtEndLinked list = new insertionAtEndLinked();
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(8);
        System.out.println("Linked List before insertion of 10");
        list.printNodes();
        System.out.println();
        list.insertAtEnd(10);
        System.out.println("Linked list after insertion of 10");
        list.printNodes();
    }
}
