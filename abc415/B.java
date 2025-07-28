package abc415;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                cnt++;
                System.out.print((i + 1));
                if (cnt % 2 == 0) {
                    System.out.println();
                    continue;
                }
                System.out.print(",");
            }
        }
    }
}
