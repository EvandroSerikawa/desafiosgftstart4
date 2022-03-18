import java.util.Scanner;

public class lerPares {
    public static void main(String[] args) {

        //Desafios
        //Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
        //Entrada
        //Você receberá 1 valor inteiro N, onde N > 0.
        //Saída
        //Exiba todos os números pares até o valor de entrada, sendo um em cada linha.


        Scanner leitor = new Scanner(System.in);

        int N = 6;
        int pares = 0;

        for( int i = 1 ; i <= N ; i ++){
            if( i%2 == 0){
                pares = i;
                System.out.println( pares );
            }
        }



    }
}
