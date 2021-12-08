package stopwatch;

public class stopWatch {
    double startTime;
    double endTime;

    public StopWatch() {
    }

    public void getStartTime() {
        startTime = System.currentTimeMillis();
    }

    public void getEndTime() {
        endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return endTime - startTime;
    }
}
