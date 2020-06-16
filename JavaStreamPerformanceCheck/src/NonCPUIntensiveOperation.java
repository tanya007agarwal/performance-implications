import java.util.Arrays;

public  class NonCPUIntensiveOperation {

      void operation() {
        int[] arr = {2,1,-1,5,33,9};
        int sum = 0 ;
        Long startTime  = System.nanoTime();;
        for(int i: arr) {
            sum+=i;
        }
        long endTime = System.nanoTime();;
        System.out.println("Time taken by for loop: " + (endTime-startTime)/1000000.0 + " ms");


        startTime  =System.nanoTime();;
        sum = Arrays.stream ( arr ).sum ();
        endTime = System.nanoTime();;
        System.out.println("Time taken by stream: " + (endTime-startTime)/1000000.0 + " ms");


        startTime  =System.nanoTime();;
        sum = Arrays.stream ( arr ).parallel ().sum ();
        endTime = System.nanoTime();;
        System.out.println("Time taken by parallel stream: " + (endTime-startTime)/1000000.0 + " ms");
        System.out.println("Sum is: "+ sum);
    }
}
