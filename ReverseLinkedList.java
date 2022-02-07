public class ReverseLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> numbers = new SinglyLinkedList<>();
        numbers.addFirst(1);
        numbers.addFirst(2);
        numbers.addFirst(3);
        numbers.reverse();
        numbers.print();
    }

    static class SinglyLinkedList<E> {
        Node<E> head;

        static class Node<E> {
            Node<E> next;
            E data;

            Node(E data) {
                this.data = data;
            }
        }

        void addFirst(E data) {
            Node<E> current = new Node<>(data);
            current.next = head;
            head = current;
        }

        void reverse() {
            Node<E> previous = null, current = head, next;
            while (current != null) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            head = previous;
        }

        void print() {
            for (Node<E> current = head; current != null; current = current.next)
                System.out.println(current.data);
        }
    }
}
