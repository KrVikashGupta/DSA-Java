/*Assigment question of ac question nuber 4 in arrayw topic 
u are given an array prices where prices[i] is the price of a given stock on the ith day.
Return the maximum profit,u can achive from this tranaction.
If u cannot achive any profit , return 0.*/
//import java.util.*;
/* 
public class solu3 {
    public static int maxProfit(int prices[]) {
        int buy = prices[0];
        int profit = 0;
        for(int i=1; i<prices.length; i++) {
            if(buy < prices[i]) {
                profit = Math.max(prices[i] - buy, profit);
            }
            else {
                buy = prices[i];
            }
        }
        return profit;
    }
    public static void main(String args[]) {
        int prices[] = { 7, 6, 4, 3};
        System.out.println(maxProfit(prices));
    }
}
*/

// import java.util.*;

// public class solu3 {
//     public static int maxProfit(int prices[]) {
//         int buy = prices[0];
//         int profit = 0;

//         for(int i=1; i<prices.length; i++) {
//             if(buy < prices[i]) {
//                 profit = Math.max(prices[i] - buy,profit);
//             }
//             else {
//                 buy = prices[i];
//             }
//         }
//         return profit;
//     }
//     public static void main(String args[]) {
//         int prices[] = {7, 6, 4, 3, 1};
//         System.out.println(maxProfit(prices));
//     }
// }


public class solu3 {
    public static int print_Stock(int prices[]) {
        int buy = prices[0];
        int profit = 0;

        for(int i=0; i<prices.length; i++) {
            if(buy < prices[i]) {
                profit = Math.max(prices[i] - buy, profit);
            }
            else {
                buy = prices[i];
            }
        }
        return profit;
    }
    public static void main(String args[]) {
        //int prices[] = {7,1,5,3,6,4};
        int prices[] = {7,6,4,3,1};
        System.out.println(print_Stock(prices));
    }
}
