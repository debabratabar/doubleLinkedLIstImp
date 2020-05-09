

public class DoubleLinkedList<E> {


    Node<E> head = null;

    void add(E data) {
        Node<E> node1 = new Node(data);
        Node<E> temp = head;
        if (head == null) {
            head = node1;
            head.prev = null;
            head.next = null;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;

        }

        node1.prev = temp;
        temp.next = node1;


    }

    void delete() {
        Node<E> temp = head;
        Node<E> temp1 = head;
        if (temp == null) {
            System.out.println("empty list");
            return;

        }
        if (temp.next == null) {
            head = null;
            return;
        }


        while (temp.next != null) {
            temp1 = temp;
            temp = temp.next;
        }
        temp1.next = null;


    }

    void show() {
        Node<E> temp = head;

        if (temp == null) {
            System.out.println("Empty list cant be print");
        } else {
            while (temp != null) {
                System.out.println(head.data);
                temp = temp.next;
            }
        }


    }

    int length(Node<E> head) {
        int count = 0;
        Node<E> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }


    static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        public Node(E data) {
            this.data = data;
            next = null;
            prev = null;
        }

    }

    public class myLinkedList {
        public void main(String[] args) {
            DoubleLinkedList<Integer> dl= new DoubleLinkedList<>();
            dl.add(4);
            dl.add(5);
            dl.add(6);
            dl.show();


            dl.delete();


            System.out.println(dl.length(dl.head));
            dl.show();


        }

    }
}
