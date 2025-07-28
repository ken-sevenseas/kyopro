package abc413;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Q = Integer.parseInt(sc.next());
        Deque<Pair> queue = new ArrayDeque<>();
        for (int i = 0; i < Q; i++) {
            int com = Integer.parseInt(sc.next());
            if (com == 1) {
                long c = Integer.parseInt(sc.next());
                long x = Integer.parseInt(sc.next());
                Pair p = new Pair(c, x);
                queue.addLast(p);
            } else {
                long k = Integer.parseInt(sc.next());
                long sum = 0;
                while (k > 0) {
                    Pair p = queue.poll();
                    if (p.quantity <= k) {
                        sum += (p.quantity * p.num);
                        k -= p.quantity;
                    } else {
                        sum += (k * p.num);
                        queue.addFirst(new Pair(p.quantity - k, p.num));
                        k = 0;
                    }
                }
                System.out.println(sum);
            }
        }
    }
}

class Pair {
    long quantity;
    long num;

    Pair(long quantity, long num) {
        this.quantity = quantity;
        this.num = num;
    }
}
