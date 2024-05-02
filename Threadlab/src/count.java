public class count extends Thread{
    public void run(){
        System.out.println("Bắt đầu");
        for (int i = 1; i<=10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Hết");
    }
}
