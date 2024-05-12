public class Task3 {
    public static void main(String[] args) {
        int[] coins = {5, 5, 3, 3, 2};
        System.out.println(canPay(coins, 11)); // true
        System.out.println(canPay(coins, 12)); // true
        System.out.println(canPay(coins, 4));  // false
        System.out.println(canPay(coins, 13)); // false
        System.out.println(canPay(coins, 16)); // true
    }

    public static boolean canPay(int[] coins, int amount) {
        return canPayRecursive(coins, amount, 0);
    }

    private static boolean canPayRecursive(int[] coins, int amount, int index) {
        if (amount == 0) {
            return true;
        }
        if (index >= coins.length) {
            return false;
        }
        if (coins[index] <= amount) {
            return canPayRecursive(coins, amount - coins[index], index) || canPayRecursive(coins, amount, index + 1);
        } else {
            return canPayRecursive(coins, amount, index + 1);
        }
    }
}
