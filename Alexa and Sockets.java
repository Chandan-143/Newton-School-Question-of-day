import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 

        int powerStrips = 0;
        int sockets = 1; 
        while(sockets < b) {
            sockets += a - 1; 
            powerStrips++; 
        }

        System.out.println(powerStrips);
    }
}