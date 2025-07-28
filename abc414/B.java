package abc414;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        StringBuilder sb = new StringBuilder();
        long len = 0;
        boolean can = true;
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            long num = Long.parseLong(sc.next());
            len += num;

            if (len > 100) {
                can = false;
                break;
            }
            for (int j = 0; j < num; j++) sb.append(s);
        }
        if (can) System.out.println(sb.toString());
        else System.out.println("Too Long");
    }
}
