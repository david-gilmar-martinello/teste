
/** Calcular o IMC
 * IMC = pesoEmQuilogramas/ (alturaEmMetros * alturaEmMetros)
 */

import javax.swing.JOptionPane;

public class IMC {

    public static void main(String[] args) {

        String peso = JOptionPane.showInputDialog("Qual a sua peso");
        String altura = JOptionPane.showInputDialog("Qual a sua altura");
        double pesoEmQuilogramas = Double.parseDouble(peso);
        double alturaEmMetros = Double.parseDouble(altura);

        double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);

        String msg = (imc >= 20 && imc <= 25) ? "Peso ideal" : "fora de forma";
        msg = "IMC = " + imc + "\n" + msg;

        JOptionPane.showMessageDialog(null, msg);

        System.out.println("IMC = " + imc);
        System.out.println(msg);
    }
}
