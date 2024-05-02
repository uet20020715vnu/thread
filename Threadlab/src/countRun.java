public class countRun  implements Runnable{
    public void run(){
        System.out.println("Runnable bắt đầu");
        for (int i = 10; i>0; i--){
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
