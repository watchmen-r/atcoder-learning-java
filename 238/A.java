import java.util.*;

class Main {
    public static void main(String args[]) {
        // System in は標準入力を指す？
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String answer =  Math.pow(2, n) > Math.pow(n, 2) ? "Yes" : "No";
        System.out.println(answer);

    }
}