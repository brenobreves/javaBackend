import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner myInput = new Scanner( System.in );
        System.out.print( "Enter the number of fibs: " );
        int amount = myInput.nextInt();
        myInput.close();
        int fib1 = 1;
        int fib2 = 1;
        for( int i = 0 ; i < amount ; i++){
            if(i<2){
                System.out.print(1+ " ");
                continue;
            }
            int next = fib1 + fib2;
            fib1 = fib2;
            fib2 = next;
            System.out.print(fib2+" ");
        }
        System.out.println("");
    }
}