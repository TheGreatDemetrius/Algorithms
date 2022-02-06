class ReverseLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<Person> people = new SinglyLinkedList<>();
        people.addFirst(new Person("Bob", 24));
        people.addFirst(new Person("Carol", 32));
        people.addFirst(new Person("Ted", 40));
        people.addFirst(new Person("Alice", 48));
        people.reverse();
        people.print();
    }

    record Person(String name, int age) {
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
