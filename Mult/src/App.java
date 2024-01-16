import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner myInput = new Scanner( System.in );
        System.out.print( "Enter the piramid height: " );
        int height = myInput.nextInt();
        myInput.close();
        for( int i = 1 ; i <= height ; i++){
            for( int j = 0 ; j < i ; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}