import java.util.*;

class 237a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long maxNum = Integer.MAX_VALUE;
        long minNum = Integer.MIN_VALUE;

        if(minNum <= n && n <= maxNum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}