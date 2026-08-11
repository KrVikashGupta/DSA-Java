
/*u want maximize your maximum your profit choose a single day to buy one stock and 
a different day int hte future to sell that stock. return the maximum profit u can achieve from 
this transaction. if u cannot profit  return 0.*/

/* 
public class BuyAndSellsStock {
    public static int BuyAndSellsStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE; // sabsae kam daam mai  stock buy karna hai 
        int maxProfit = 0;

        //loop| two case |
        for(int i=0; i<prices.length; i++) {
            if(buyPrice < prices[i]) {  //prices[i] = current prices
                int profit = prices[i] - buyPrice;  //today profit agar hum aaj stock ko sell karegae to profit 
                maxProfit = Math.max(maxProfit,profit);  //global profit sara din ka 
            }   //jis din profit na ho  us  din buyprices ko update kar do 
            else {
                buyPrice = prices[i];
            }  
        }
        return maxProfit;
    }
    public static void main(String args[]) {
        int prices[] ={7, 1, 5, 3, 6};
        System.out.println(BuyAndSellsStocks(prices));
    }
}
/*
output is 5 it means 
1 is the minimum stock day  prices we can buy a stock.
jis din 1 hai uus din buy karuga  aur jis din 6 hai hai uus di  sellkaruga
to humko jada  profit hoga that is  5  */



// import java.util.*;

// public class BuyAndSellsStock {
//     public static int BuyandSell(int prices[]) {
//         int buyPrices = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         for(int i=0; i<prices.length; i++) {
//             if(buyPrices < prices[i]) {
//                 int Profit = prices[i] - buyPrices;
//                 maxProfit = Math.max(maxProfit, Profit);
//             }
//             else {
//                 buyPrices = prices[i];
//             }
//         }
//         return maxProfit;
//     }
//     public static void main(String args[]) {
//         int prices[] = { 3, 4, 7, 1, 9, 8, 4, 8, 3};
//         System.out.println(BuyandSell(prices));
//     }
// }

// public class BuyAndSellsStock {
//     public static int print_Max_Profit(int prices[]) {
//         int max_Profit = 0;
//         int buy_Prices = Integer.MAX_VALUE;
        

//         for(int i=0; i<prices.length; i++) {
//             if(buy_Prices < prices[i]) {
//                 int Profit = prices[i] - buy_Prices;
//                 max_Profit = Math.max(max_Profit, Profit);
//             }
//             else {
//                 buy_Prices = prices[i];
//             }
//         }
//         return max_Profit;
//     }
//     public static void main(String args[]) {
//         int prices[] = {7,1,5,3,6,4};
//         System.out.println("Maximum Profit: " + print_Max_Profit(prices));
//     }
// }

// public class BuyAndSellsStock {
//     public static int print_max_Profit(int prices[]) {
//         int b_P = Integer.MAX_VALUE;
//         int max_Profit = 0;

//         for(int i=0; i<prices.length; i++) {
//             if(b_P < prices[i]) {
//                 int profit = prices[i] - b_P;
//                 max_Profit = Math.max(max_Profit, profit); 
//             }
//             else {
//             b_P = prices[i];
//             }
//         }
//         return max_Profit;
//     }
//     public static void main(String args[]) {
//         int prices[] = {7,1,5,3,6,4};
//         System.out.println("Maximum Profit is : "+  print_max_Profit(prices));
//     }
// }


public class BuyAndSellsStock {
    public static int max_Profit(int prices[]) {
        int buy_Prices = Integer.MAX_VALUE;
        int max_Profit = 0;

        for(int i=0; i<prices.length; i++) {
            if(buy_Prices < prices[i]) {
                int profit = prices[i] - buy_Prices;
                max_Profit = Math.max(profit, max_Profit);
            }
            else {
                buy_Prices = prices[i];
            }
        }
        return max_Profit;
    }
    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(max_Profit(prices));
    }
}