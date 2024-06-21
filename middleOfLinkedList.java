

class reversalRecursively {
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

    public void insertAfterAnyNode(Node prevNode, int newData){
        if (prevNode==null){
            System.out.println("The previous node cannot contain the null values");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void deleteAnyNode(int position){
        if(head==null){
            return;
        }
        Node temp = head;
        if(position==0){
            head = temp.next;
            return;
        }

        for(int i=0; temp!=null && i<position-1; i++){
            temp = temp.next;
        }
        if(temp==null || temp.next==null){
            return;
        }
        temp.next = temp.next.next;
    }
    public void reverseRecursively(Node curr, Node prev){
        if(curr.next==null){
            head = curr;
            curr.next = prev;
            return;
        }
        Node nextPtr = curr.next;
        curr.next = prev;
        reverseRecursively(nextPtr,curr);
    }

    public void middleNode(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("MIDDLE ELEMENT OF THIS LINKED LIST IS : " + slow.data);
    }
    public void printNodes(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        reversalRecursively list = new reversalRecursively();
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(8);
        System.out.println("Before insertion of 10,1 and 19");
        list.printNodes();
        System.out.println();

        list.insertAtEnd(10);
        list.insertAtBeginning(1);
        list.insertAtBeginning(19);
        System.out.println("After insertion of 10, 1 and 19");
        list.printNodes();
        System.out.println();
        list.insertAfterAnyNode(list.head.next,13);
        System.out.println("After insertion of 13 at any node:");
        list.printNodes();
        System.out.println();

        
        list.deleteAnyNode(3);
        System.out.println("Linked List after deletion of the node at position 3:");
        list.printNodes();
        System.out.println();

        list.reverseRecursively(list.head,null);
        System.out.println("AFTER RECURSIVELY REVERSAL LINKED LIST:");
        list.printNodes();
        System.out.println();
        list.middleNode();
    }
}
