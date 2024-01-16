import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner myInput = new Scanner( System.in );
        System.out.print( "Enter the number: " );
        int num = myInput.nextInt();
        myInput.close();
        String signal = "";
        String tipo = "";
        if (num % 2 == 0){
            tipo = "par";
        } else{
            tipo = "impar";
        }
        if (num < 0){
            signal = "negativo";
        } else{
            signal = "positivo";
        }
        System.out.println(num + " é " + tipo + " e " + signal);
    }
}