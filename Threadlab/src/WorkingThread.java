public class WorkingThread extends Thread {
    public WorkingThread(String name) {
        super(name);
    }

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("Luồng: %s có độ ưu tiên là %d \n", getName(), getPriority());
        }
    }
}