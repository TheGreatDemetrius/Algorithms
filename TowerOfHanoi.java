public class TowerOfHanoi {
    public static void main(String[] args) {
        move(8, 'A', 'B', 'C');
    }

    static void move(int n, char source, char auxiliary, char target) {
        if (n > 0) {
            move(n - 1, source, target, auxiliary);
            System.out.println(source + " -> " + target);
            move(n - 1, auxiliary, source, target);
        }
    }
}
