public class Node {
    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node l) {
        this.val = val;
        this.l = l;
    }

    public Node(int val, Node l, Node r) {
        this.val = val;
        this.l = l;
        this.r = r;
    }

    int val;
    Node l;
    Node r;
}
