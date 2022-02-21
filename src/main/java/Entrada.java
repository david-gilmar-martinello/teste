
/** import java.util.Scanner;
 * public class Entrada{
 *
 *
 *
 * // recuperando dados de usuario
 *
 * public static void main (String[] args){
 * //chamada  do progama
 *
 * //System.out.println (args[0]);
 *
 * //Interagindo  com o Usuario
 *
 * Scanner s = new Scanner (System.in);   //scanner serve para dar uma entrada de dados
 * System.out.println("Qual e o seu nome?");
 * String nome = s.nextLine();
 * System.out.println("Bem vindo " + nome);
 *
 *
 * }
 *
 * } */
import javax.swing.JOptionPane;

public class Entrada {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual é o seu nome"); //esse metodo ele retorna um valor do tipo string
        JOptionPane.showMessageDialog(null, nome);// ele está retornando um valor em uma caixa de dialogo
    }
}

// JOptionPane ele é muito utilizado ? em quais situações
