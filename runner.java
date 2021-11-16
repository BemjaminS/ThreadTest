/**
 * runner
 */
public class runner {

    public static void main(String[] args) {
        
        number n = new number();
        Thread t1 = new Thread(n);
        Thread t2 = new Thread(n);
    
        t2.start();
        t1.start();
            
        
    }

}