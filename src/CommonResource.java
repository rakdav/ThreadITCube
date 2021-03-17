public class CommonResource
{
    int x=0;
    synchronized void increment()
    {
        x = 1;
        for (int i = 1; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + x);
            x++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
