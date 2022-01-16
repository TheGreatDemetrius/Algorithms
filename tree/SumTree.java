public class Tree {
    public static void main(String[] args) {
        System.out.println(
                getS(
                        new Node(512,
                                new Node(256,
                                        new Node(128),
                                        new Node(64,
                                                new Node(32)
                                        )
                                ),
                                new Node(16,
                                        new Node(8),
                                        new Node(4,
                                                new Node(2)
                                        )
                                )
                        )
                )
        );
    }

    public static int getS(Node n) {
        return n == null ? 0 : getS(n.r) + getS(n.l) + n.val;
    }
}
