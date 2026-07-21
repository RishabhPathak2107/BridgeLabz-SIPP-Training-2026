import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc --> 0) {
            int n = sc.nextInt();
            int money = sc.nextInt();
            int[] sell = new int[n];
            int[] need = new int[n];
            for(int i=0;i<n;i++) {
                sell[i] = sc.nextInt();
                need[i] = sc.nextInt();
            }
            int[] ans = solve(money,sell,need);
            System.out.println(ans[0] + " " + ans[1]);
        }
        sc.close();
    }
    public static int[] solve(int currMoney, int[] sellAmount, int[] needAmount) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            int diff = (b[0] - b[1]) - (a[0] - a[1]);
            if(diff == 0) {
                return a[1] - b[1];
            }
            return diff;
        });
        for(int i=0;i<sellAmount.length;i++) {
            pq.add(new int[]{sellAmount[i],needAmount[i]});
        }
        int profit = 0;
        while(!pq.isEmpty()) {
            int[] top = pq.remove();
            if(currMoney >= top[1]) {
                profit += (top[0] - top[1]);
                currMoney -= top[1];
            }
        }
        return new int[]{profit,currMoney};
    }
}