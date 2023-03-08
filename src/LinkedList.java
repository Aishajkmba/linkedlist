public class LinkedList {
    private Node head;
    private int numberOfNodes;

    public LinkedList(){
        //create an empty list
        head=null;
        numberOfNodes = 0;
    }

    public LinkedList(int[] values) {
        head = new Node(values[0]); //assuming the array has at least 1 element
        Node adding;
        Node current = head;
        for(int i=1; i<values.length; i++){
            adding = new Node(values[i]);
            current.setNext(adding);
            current = current.getNext();

        }
    }

    public void display(){
        //display each element on the same line in the console
        Node current = head;
        while(current != null) {
            System.out.print(current.getValue()+", ");
            current = current.getNext();
        }
        System.out.println();
    }
    public void addNode(int v){
        //create a new node with the new value
        Node nodeToAdd = new Node(v);
        // add to the end of the list
        Node current = head;
        while(current.getNext() !=null) {
            current = current.getNext();
        }
        current.setNext(nodeToAdd);
        numberOfNodes++;
    }
    public int size() { // walk the list, counting as we go
        Node current = head;
        int counter = 0;
        while(current != null) {
            current = current.getNext();
            counter++;
        }
        return counter;
    }
    public Node remove(int index) {
        //retrieve and remove the node at index
        //walk through the list till the index
        Node current = head;
        int count =0;
        while (current != null && count < index) {
            System.out.print(current.getValue() + "");
            current = current.getNext();
            count++;
        }
        return current;
        // remove node at given index
        //return the removed node
    }
}



