
import java.util.Scanner;


public class comparacao {

    public static void main(String[] arg) {
        //int idade = 6;
        /**
         * String x = (idade >= 18) ? "Maior de idade " : "Menor de idade";
         * System.out.println (x);
         *
         * String sexo = "M", pais = "Brasil"; System.out.println (x);
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Informe o raio");
        double raio = s.nextDouble();
        // Diametro 2r

        //double raio = 10;
        double diametro = 2 * raio;
        System.out.println("diametro=" + Double.toString(diametro));
        //Circunferencia : 2 PI r

        double pi = Math.PI;
        double circunferencia = 2 * pi * raio;
        System.out.println("circunferencia=" + circunferencia);

        // aera PI r2
        double aera = pi * (raio * raio);
        System.out.println("aera=" + aera);

    }

}
