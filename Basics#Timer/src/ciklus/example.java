package ciklus;
import java.util.Timer;
import java.util.TimerTask;
 
public class example {
    public static void main(String[] args) {
 
       

    }
    private void initTasks() {
    TimerTask task1 = new MyTimerTask1();
    TimerTask task2 = new MyTimerTask2();
    TimerTask task3 = new MyTimerTask3();
    Timer timer = new Timer();
    timer.schedule(task1, 0, 1);
    timer.schedule(task2, 0, 2);
    timer.schedule(task3, 0, 3);
}

class MyTimerTask1 extends TimerTask {
    public void run() {
        //do task1
    }
}

class MyTimerTask2 extends TimerTask {
    public void run() {
        //do task2
    }
}

class MyTimerTask3 extends TimerTask {
    public void run() {
        //do task3
    }
}
}
