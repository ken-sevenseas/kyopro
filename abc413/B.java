package abc413;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] strs = new String[n];
        Set<String> str = new HashSet<>();

        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                str.add(strs[i] + strs[j]);
            }
        }

        System.out.println(str.size());
    }
}
