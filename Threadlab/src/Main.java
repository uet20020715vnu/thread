//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        count c = new count();
        c.start();
        countRun b =  new countRun();     // luồng main nên khi c.start chưa xong vẫn tạo ra b và gọi start
        Thread t = new Thread(b);
        t.start();
    }
}