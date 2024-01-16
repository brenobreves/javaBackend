import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner myInput = new Scanner( System.in );
        System.out.print( "Enter the number to multiply: " );
        int num = myInput.nextInt();
        System.out.println("Tabela de multiplicação por "+ num);
        for( int i = 1 ; i <= 10 ; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}