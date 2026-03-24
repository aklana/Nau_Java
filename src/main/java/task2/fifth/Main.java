package task2.fifth;

public class Main {

    public static void main(String[] args) {
        ProcessingTask task = new ProcessingTask();

        task.Add("Текст романа");
        task.Add("Текст песни");
        task.Add("Текст стихотворения");
        task.Add("Текст пьесы");
        Thread thread = new Thread(task::start);
        thread.start();
        task.stop();
    }
}