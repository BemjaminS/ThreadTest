/**
 * runner
 */
public class runner {

    public static void main(String[] args) {
        
        number n = new number();
        Thread t1 = new Thread(n);
        Thread t2 = new Thread(n);
    
        t1.start();
        t2.start();

        
            
        
    }

}