package main;


public class LocationClass {

 private int row;
    private int column;
    private double maxValue;

    // No-arg constructor
    public LocationClass() {
        this.row = 0;
        this.column = 0;
        this.maxValue = Double.MIN_VALUE;
    }

    // Constructor with specified values for row, column, and maxValue
    public LocationClass(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    // Accessor methods for row, column, and maxValue
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public LocationClass(double maxValue) {
        this.maxValue = maxValue;
    }
    
}
