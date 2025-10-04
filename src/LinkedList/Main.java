package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {

    Node head;

    void insert(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;

            while (current.next != null) {

                current = current.next;
            }

            current.next = new Node(data);
        }
    }


    void display()
    {

        Node temp = head;

        while(temp!= null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    void delete()
    {
        Node temp = head;
        Node prev;
        while(temp.next!=null)
        {
            prev=temp;
            temp= temp.next;
        }
    }
}


public class Main {


    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);

          list.display();
    }
}
