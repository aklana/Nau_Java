package task2.fifth;
import java.util.LinkedList;
import java.util.Queue;

public class processingTask implements Task{
    private Queue<String> queue = new LinkedList<>();
    boolean stopProcess = false;

    public void Add(String data) {
        queue.add(data);
    }

    @Override
    public void start() {
        stopProcess = false;

        while (!stopProcess && !queue.isEmpty()) {

            String data = queue.poll();
            System.out.println("Обрабатываются данные "+data);
        }
    }

    @Override
    public void stop() {
        stopProcess=true;
        System.out.println("Обработка приостановлена");
    }
}
