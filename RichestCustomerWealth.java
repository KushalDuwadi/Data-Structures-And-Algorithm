public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] accounts = {
            {4, 5, 6},
            {4, 5, 9}
        };
        System.out.println(maximumWealth(accounts)); // Should print 18
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j]; 
            }

            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}
