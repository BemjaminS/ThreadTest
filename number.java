import java.util.concurrent.Semaphore;

public class number extends Thread{
    Semaphore sem = new Semaphore(1);

    private int count;
    public number(){
        //
    }

    public void run() {
        try {
            sem.acquire();
            for (int i = 0; i < 20; i++) {
                count++;
                System.out.print(i + " ");
                Thread.sleep(500);
            }
            System.out.println();
            System.out.println(count + " " + Thread.currentThread().getName());

        } catch (InterruptedException e) {
              e.getStackTrace();
            }
        sem.release();

    }


}
