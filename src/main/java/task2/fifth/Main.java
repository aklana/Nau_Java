package task2.fifth;

public class Main {

    public static void main(String[] args) {
        processingTask task = new processingTask();

        task.Add("Текст романа");
        task.Add("Текст песни");
        task.Add("Текст стихотворения");
        task.Add("Текст пьесы");
        task.start();
        task.stop();
    }
}