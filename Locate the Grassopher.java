import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long n = sc.nextLong();

       if(x%2!=0){
           if(n%4==0){
               System.out.println(x);
           }
           else if(n%4==1){
               System.out.println(x+n);

           }
           else if(n%4==2){
               System.out.println(x-1);
               
           }
            else if(n%4==3){
               System.out.println(x-n-1);
               
           }
       }
       else {
           if(n%4==0){
               System.out.println(x);

           }
           else if(n%4==1){
               System.out.println(x-n);

           }
           else if(n%4==2){
               System.out.println(x+1);
               
           }
             else if(n%4==3){
               System.out.println(x+n+1);
               
           }
       }
    }
}