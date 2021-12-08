package stopwatch;

public class stopWatch {
    long startTime, endTime;

    public stopWatch() {
    }

    public long getStartTime() {
        startTime = System.currentTimeMillis();
        return startTime;
    }
    public double stopWatch(){
        return (endTime - startTime)/1000.0;
    }
}
