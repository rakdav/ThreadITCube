import java.io.File;

public class MainClass
{
    public static void main(String[] args) {
//        CommonResource commonResource=new CommonResource();
//        for (int i = 1; i <6; i++) {
//            Thread t=new Thread(new CountThread(commonResource));
//            t.start();
//        }
        Store store=new Store();
        Producer producer=new Producer(store);
        Consumer consumer=new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }

}
