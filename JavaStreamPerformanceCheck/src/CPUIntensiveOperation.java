import java.util.Arrays;

public class CPUIntensiveOperation {
    void operation() throws InterruptedException {
        int[] arr = {2,1,-1,5,33,9,0,7,55};

        Long startTime  = System.nanoTime();;
        for(int i: arr) {
            Thread.sleep ( 5 );
        }
        Long endTime = System.nanoTime();;
        System.out.println("Time taken by for loop: " + (endTime-startTime)/1000000.0 + " ms");


        startTime  =System.nanoTime();;
        Arrays.stream ( arr ).forEach (s-> {
            try {
                Thread.sleep ( 5 );
            }
            catch ( InterruptedException e ) {
                e.printStackTrace ();
            }
        } );
        endTime = System.nanoTime();;
        System.out.println("Time taken by stream: " + (endTime-startTime)/1000000.0 + " ms");


        startTime  =System.nanoTime();;
        Arrays.stream ( arr ).parallel ().forEach (s-> {
            try {
                Thread.sleep ( 5 );
            }
            catch ( InterruptedException e ) {
                e.printStackTrace ();
            }
        } );
        endTime = System.nanoTime();;
        System.out.println("Time taken by parallel stream: " + (endTime-startTime)/1000000.0 + " ms");
    }
}
