package stocktest;

public class StockTest {
    public static void main(String[] args) {
        
        
        // Create a Stock object with symbol ORCL, name Oracle Corporation, and previous closing price of 34.5
        Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5);

        // Set the current price to 34.35
        stock.setCurrentPrice(34.35);

        // Display the price-change percentage
        double changePercent = stock.getChangePercent();
        System.out.println("Stock Symbol: " + stock.getSymbol());
        System.out.println("Stock Name: " + stock.getName());
        System.out.println("Previous Closing Price: " + stock.getPreviousClosingPrice());
        System.out.println("Current Price: " + stock.getCurrentPrice());
        System.out.printf("Change Percent: %.2f%%\n", changePercent);
        
    }
    
}
