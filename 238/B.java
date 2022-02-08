import java.util.*;

class Main {
    public static void solve(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(360);

        int nowDegree = 0;
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (nowDegree + a >= 360) {
                nowDegree = nowDegree + a - 360;
            } else {
                nowDegree += a;
            }
            list.add(nowDegree);
        }
        Collections.sort(list);

        int max = 0;

        for(int i = 1; i <= n+1; i++) {
            max = Math.max(max, Math.abs(list.get(i) - list.get(i - 1)));
        }

        System.out.println(max);
    }
}