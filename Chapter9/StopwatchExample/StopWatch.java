package StopwatchExample;


public class StopWatch {

     private long startTime;
    private long endTime;

    // No-arg constructor
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    // Start method to reset the start time
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Stop method to set the end time
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Get elapsed time in milliseconds
    public long getElapsedTime() {
        return endTime - startTime;
}
}
