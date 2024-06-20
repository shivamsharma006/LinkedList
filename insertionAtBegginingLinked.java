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
    //only difference from insertAtEnd and this code is below given:-
    public void insertAtBeginning(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
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
        System.out.println("Before insertion of 1 and 19");
        list.printNodes();
        System.out.println();

        list.insertAtBeginning(1);
        list.insertAtBeginning(19);


    
        System.out.println("After insertion of 1 and 19");
        list.printNodes();
        System.out.println();
    }
}
