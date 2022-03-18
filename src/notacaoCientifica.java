import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class notacaoCientifica {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        double X = leitor.nextDouble();

        if( X > 0 ){
            System.out.printf("+");
            System.out.printf(Locale.ROOT, "%5.4E", X);
        }else{
            System.out.printf(Locale.ROOT, "%5.4E", X);
        }


    }
}
