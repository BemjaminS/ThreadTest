public class number extends Thread{

    private int count;
    public number(){
        //
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            count++;
        }
        System.out.println(count + " " + Thread.currentThread().getName());
    }

    
}
