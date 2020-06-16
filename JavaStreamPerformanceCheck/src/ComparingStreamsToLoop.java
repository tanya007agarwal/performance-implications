import java.util.Arrays;
/*
------------ output --------------
------------NonCPUIntensiveOperation----------
Time taken by for loop: 0.053476 ms
Time taken by stream: 54.626203 ms
Time taken by parallel stream: 3.456574 ms
Sum is: 49
------------CPUIntensiveOperation----------
Time taken by for loop: 47.304721 ms
Time taken by stream: 51.284312 ms
Time taken by parallel stream: 11.730947 ms


*/

public class ComparingStreamsToLoop {

    public static void main ( String[] args ) throws InterruptedException {
        new NonCPUIntensiveOperation ().operation ();
        new CPUIntensiveOperation ().operation ();
    }
}
