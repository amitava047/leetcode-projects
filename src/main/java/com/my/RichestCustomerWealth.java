package com.my;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int richestWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (richestWealth < sum)
                richestWealth = sum;
        }
        return richestWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{9,10,0}};
        System.out.println(maximumWealth(accounts));
    }
}
