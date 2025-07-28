package abc414;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.next());
        long N = Long.parseLong(sc.next());
        int keta = String.valueOf(N).length();
        List<Long> list = new ArrayList<>();

        for (int i = 1; i <= (keta + 1) / 2; i++) {
            long start = (long) Math.pow(10, i - 1);
            long end = (long) Math.pow(10, i) - 1;
            for (long j = start; j <= end; j++) {
                String s = String.valueOf(j);
                String rev = new StringBuilder(s).reverse().toString();
                long even = Long.parseLong(s + rev);
                if (even <= N) list.add(even);

                long odd = Long.parseLong(s + rev.substring(1));
                if (odd <= N) list.add(odd);
            }
        }

        long ans = 0;
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder();
            long num = list.get(i);
            while (num > 0) {
                sb.append(num % A);
                num /= A;
            }
            if (isPalindrome(sb.toString())) ans += list.get(i);
        }
        System.out.println(ans);
    }

    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }

        return true;
    }
}
