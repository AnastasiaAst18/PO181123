abstract class Task
{
    abstract void execute();
}
class Timer
{
    public void runMultipleTimes(Task task, int count)
    {
        for (int i = 1; i <= count; i++)
        {
            task.execute();
        }
    }
}
public class zad5
{
    public static void main(String[] args)
    {
        Timer timer = new Timer();
        timer.runMultipleTimes(new Task() {
            private int callCounter = 0;
            @Override
            void execute() {
                callCounter++;
                System.out.println("Uruchomienie zadania nr: " + callCounter);
            }
        }, 5);
    }
}
