package stocktest;

public class Stock {
    
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // No-arg constructor
    public Stock() {
        this.symbol = "";
        this.name = "";
        this.previousClosingPrice = 0.0;
        this.currentPrice = 0.0;
    }

    // Constructor with specified symbol, name, and previous closing price
    public Stock(String symbol, String name, double previousClosingPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = previousClosingPrice;
    }

    // Method to calculate the percentage change from previousClosingPrice to currentPrice
    public double getChangePercent() {
        if (previousClosingPrice == 0.0) {
            return 0.0;
        }
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100.0;
    }

    // Getters and setters for the fields
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    
}
